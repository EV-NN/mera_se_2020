package com.mera.lection7.reflection;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person() {
    }

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
