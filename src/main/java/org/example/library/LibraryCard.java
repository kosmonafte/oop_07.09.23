package org.example.library;

import java.time.LocalDate;
import java.util.ArrayList;

public class LibraryCard {
    private String name;
    private int age;
    private int number;

    private LocalDate creationDate;
    private ArrayList<Record> records;

    public LibraryCard(String name, int age, int number) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.creationDate = LocalDate.now();
        this.records = new ArrayList<>();
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void addOpenRecord(Book book) {
        OpenCardRecord record = new OpenCardRecord(book, 10);
        records.add(record);
    }

    public void addCloseRecord(Book book) {
        CloseCardRecord record = new CloseCardRecord(book);
        records.add(record);
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

    @Override
    public String toString() {
        String str = new String();
        str += "Номер билета: " + number + ", дата выдачи: " + this.creationDate + ", имя держателя: " + name + ", возраст держателя: " + age + "\n";
        str += "Статус:\t\tАвтор-Название:\t\t\t\t\t\tДата записи:\tВернуть до:\n";
        for (Record rec:records) {
            str += rec.toString() + "\n";
        }
        return str;
    }
}
