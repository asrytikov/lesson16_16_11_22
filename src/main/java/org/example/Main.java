package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /*People p = context.getBean(People.class);
        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);*/

        People p = context.getBean(People.class);
        System.out.println(p);
        System.out.println(p.getName());
        Integer i = context.getBean(Integer.class);
        System.out.println(i);

        /*if (cond) {
            registerBean(b1);
            }else{
            registerBean(b2);
            }
        * */
    }
}