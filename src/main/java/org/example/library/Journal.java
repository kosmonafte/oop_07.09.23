package org.example.library;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Journal {
    private ArrayList<Record> records;

    public Journal() {
        this.records = new ArrayList<>();
    }

    public void addRecord(LibraryCard card, Book book) {
        Record record = new Record(card.getName(), card.getNumber(), book, LocalDate.now(), LocalDate.now().plusDays(10));
        this.records.add(record);
    }

    public void delRecord(int index) {
        this.records.remove(index);
    }

    public Record getRecord(int index) {
        return records.get(index);
    }

    @Override
    public String toString() {
        return records.toString();
    }
}
