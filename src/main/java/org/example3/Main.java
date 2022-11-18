package org.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        People people = context.getBean(People.class);
        System.out.println("People name: " + people.getName());
        System.out.println("People's dog:" + people.getDog());
    }
}
