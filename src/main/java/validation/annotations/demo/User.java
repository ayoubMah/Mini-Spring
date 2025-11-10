package main.java.validation.annotations.demo;

import main.java.validation.annotations.core.Email;
import main.java.validation.annotations.core.NotNull;
import main.java.validation.annotations.core.Range;

public class User {

    @NotNull(message = "Name cannot be null")
    private String name;

    @Range(min=18, max=99, message = "Age must be between 18 and 99")
    private int age;

    @Email(message = "please enter a valid email")
    private String email;

    public User(String name, int age, String email){
        this.name= name;
        this.age  = age;
        this.email = email;
    }
}
