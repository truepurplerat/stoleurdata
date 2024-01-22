package com.pigrat.stoleurdata;

public class User {
    public String name;
    public Integer age;
    public String gender;

    User(String name, Integer age, String gender) {
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
