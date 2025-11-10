package main.java.validation.annotations.demo;

import main.java.validation.annotations.core.NotNull;
import main.java.validation.annotations.core.Range;

public class User {

    @NotNull(message = "Name cannot be null")
    private String name;

    @Range(min=18, max=99, message = "Age must be between 18 and 99")
    private int age;

    public User(String name, int age){
        this.name= name;
        this.age  = age;
    }
}
