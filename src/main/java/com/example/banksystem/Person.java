package com.example.banksystem;

public abstract class Person {
    protected String username;
    protected String password;
    protected String role;
    public Person(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getRole() {
        return role;
    }


}
