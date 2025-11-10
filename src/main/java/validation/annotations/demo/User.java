package main.java.validation.annotations.demo;

import main.java.validation.annotations.core.NotNull;

public class User {

    @NotNull(message = "Name cannot be null")
    private String name;

    private int age;

    public User(String name, int age){
        this.name= name;
        this.age  = age;
    }
}
