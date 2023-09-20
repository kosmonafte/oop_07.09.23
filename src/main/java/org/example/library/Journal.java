package org.example.library;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Journal {
    private ArrayList<Record> records;

    public Journal() {
        this.records = new ArrayList<>();
    }

    public void addOpenRecord(LibraryCard card, Book book) {
        OpenJournalRecord record = new OpenJournalRecord(card, book, 10);
        this.records.add(record);
    }

    public void addCloseRecord(LibraryCard card, Book book) {
        CloseJournalRecord record = new CloseJournalRecord(card, book);
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
        String str = new String();
        str += "Журнал\n";
        str += "Статус:\t\t№ Ч/Б\t\tАвтор-Название:\t\t\t\t\t\tДата записи:\t\tВернуть до:\n";
        for (Record record:records) {
            str += record.toString() + "\n";
        }
        return str;
    }
}
