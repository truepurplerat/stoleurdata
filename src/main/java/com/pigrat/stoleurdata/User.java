package com.pigrat.stoleurdata;

public class User {
    public String name;
    public int age;
    public String gender;

    User(String name, int age, String gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
