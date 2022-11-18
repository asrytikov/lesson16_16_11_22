package org.example5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example5")
public class ProjectConfig {
    @Bean
    public Dog dog1(){
        Dog d = new Dog();
        d.setName("Tuzik1");
        return d;
    }

    @Bean
    public Dog dog2(){
        Dog d = new Dog();
        d.setName("Tuzik2");
        return d;
    }

    @Bean
    public People people(@Qualifier("dog2") Dog dog){
        People p = new People();
        p.setName("Ivan");
        p.setDog(dog);
        return p;
    }
}
