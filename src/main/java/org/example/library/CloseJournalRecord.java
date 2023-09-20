package org.example.library;

import java.time.LocalDate;

public class CloseJournalRecord extends Record{
    private String readerName;
    private int readerNumber;

    public CloseJournalRecord() {
        super();
        this.readerName = null;
        this.readerNumber = 9999999;
    }

    public CloseJournalRecord(LibraryCard card, Book book) {
        super(book);
        this.status = "Возврат";
        this.readerName = card.getName();
        this.readerNumber = card.getNumber();
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public int getReaderNumber() {
        return readerNumber;
    }

    public void setReaderNumber(int readerNumber) {
        this.readerNumber = readerNumber;
    }

    @Override
    public String toString() {
        return this.status + "\t\t" + readerNumber + "\t\t\t" + book + "\t\t" + dateRecord;
    }
}
