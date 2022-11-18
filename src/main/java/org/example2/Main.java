package org.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /*var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        People x = new People();
        x.setName("Stepan");
        Supplier<People> peopleSupplier = () -> x;
        context.registerBean("people1", People.class, peopleSupplier, bc -> bc.setPrimary(true));

        People p = context.getBean(People.class);
        System.out.println(p.getName());*/
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        People people = context.getBean(People.class);
        Dog dog = context.getBean(Dog.class);
        System.out.println("People name: " + people.getName());
        System.out.println("Dog name:" + dog.getName());
        System.out.println("People's dog:" + people.getDog());
    }
}
