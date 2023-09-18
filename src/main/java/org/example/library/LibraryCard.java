package org.example.library;

import java.time.LocalDate;
import java.util.ArrayList;

public class LibraryCard {
    private String name;
    private int age;
    private int number;
    private ArrayList<Record> records;

    public LibraryCard(String name, int age, int number) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.records = new ArrayList<>();
    }

    public void addRecord(Book book) {
        records.add(new Record(this.name, this.number, book, LocalDate.now(), LocalDate.now().plusDays(10)));
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
