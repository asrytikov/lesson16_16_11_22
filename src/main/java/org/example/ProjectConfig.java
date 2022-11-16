package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

    @Bean
    @Primary
    People people(){
    var p = new People();
        p.setName("Ivan");
        return p;
    }

    @Bean
    People people2(){
        var p = new People();
        p.setName("Masha");
        return p;
    }

    @Bean(name = "Dasha")
    People people3(){
        var p = new People();
        p.setName("Dasha");
        return p;
    }

    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }


}
