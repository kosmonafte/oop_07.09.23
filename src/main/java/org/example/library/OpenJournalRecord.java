package org.example.library;

import java.time.LocalDate;

public class OpenJournalRecord extends Record{
    private String readerName;
    private int readerNumber;
    private LocalDate retDate;

    public OpenJournalRecord() {
        super();
        this.readerName = null;
        this.readerNumber = 9999999;
        this.retDate = LocalDate.now().plusDays(10);
    }

    public OpenJournalRecord(LibraryCard card, Book book, int days) {
        super(book);
        this.status = "Выдано";
        this.readerName = card.getName();
        this.readerNumber = card.getNumber();
        this.retDate = LocalDate.now().plusDays(days);
    }

    public LocalDate getRetDate() {
        return retDate;
    }

    public void setRetDate(LocalDate retDate) {
        this.retDate = retDate;
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
        return this.status + "\t\t" + readerNumber + "\t\t\t" + book + "\t\t" + dateRecord + "\t\t\t" + retDate;
    }
}
