package com.tisbi.template;

public class Person {
    private String firstname;
    private int age;
    private int number;
    private String address;

    public Person(String firstname, int age, int number, String address) {
        this.firstname = firstname;
        this.age = age;
        this.number = number;
        this.address = address;
    }

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
