package org.example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Dog dog(){
        Dog d = new Dog();
        d.setName("Tuzik");
        return d;
    }

/*    @Bean
    public People people(){
        People p = new People();
        p.setName("Ivan");
        p.setDog(dog());
        return p;
    }*/

    @Bean
    public People people(Dog dog){
        People p = new People();
        p.setName("Ivan");
        p.setDog(dog);
        return p;
    }

}
