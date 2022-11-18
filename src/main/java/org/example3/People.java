package org.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class People {
    private String name = "Ivan";
    /* 1-й способ связи
    @Autowired
    private Dog mydog;*/
/*
    2-й сп связи
    private final Dog mydog;

    @Autowired
    public People(Dog dog){
        mydog = dog;
    }
    */
    private Dog mydog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return mydog;
    }

    @Autowired
    public void setDog(Dog mydog) {
        this.mydog = mydog;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}
