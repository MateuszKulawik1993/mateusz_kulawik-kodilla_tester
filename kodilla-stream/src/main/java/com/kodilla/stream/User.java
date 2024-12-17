package com.kodilla.stream;

import java.util.Objects;
public class User {

    private String username;
    private String group;
    private int age;

    public User(String username, String group, int age) {
        this.username = username;
        this.group = group;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }
}
