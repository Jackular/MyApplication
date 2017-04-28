package com.example.tom.loginregister;

/**
 * Created by Tom on 17/02/2017.
 */

public class User {
    String firstname, surname, email, password;


    public User(String firstname, String surname, String email, String password) {
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public User(String email, String password) {
        this.firstname = "";
        this.surname = "";
        this.email = email;
        this.password = password;
    }
}