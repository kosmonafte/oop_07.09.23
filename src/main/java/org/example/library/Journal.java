package org.example.library;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Journal {
    private ArrayList<Record> records;

    public Journal() {
        this.records = new ArrayList<>();
    }

    public void addRecord(Record record) {
        this.records.add(record);
    }

    public void delRecord(int index) {
        this.records.remove(index);
    }

    public Record getRecord(int index) {
        return records.get(index);
    }
}
