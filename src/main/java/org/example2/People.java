package org.example2;

public class People {
    private String name;
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
