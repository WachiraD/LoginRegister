package com.example.david.loginregister;

/**
 * Created by David on 4/18/2017.
 */

public class User {

    String name, username, password;
    int age;

//constructor1
    public User (String name, int age, String username, String password){
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    //constructor2
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.age = -1;
        this.name = "";
    }
}
