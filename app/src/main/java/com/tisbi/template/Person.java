package com.tisbi.template;

public class Person {
    private String firstname;
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Person(String firstname) {
        this.firstname = firstname;
    }

    Person(String firstname, int age) {
        this.firstname = firstname;
        this.age = age;
    }

}
