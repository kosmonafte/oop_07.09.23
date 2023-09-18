package org.example.library;

public class Human {
    protected String name;
    protected int age;

    public Human() {
        this.name = "name";
        this.age = 18;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
