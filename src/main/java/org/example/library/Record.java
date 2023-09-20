package org.example.library;

import java.time.LocalDate;

public abstract class Record {

    protected String status;
    protected Book book;
    protected LocalDate dateRecord;

    public Record() {
        this.status = null;
        this.book = new Book();
        this.dateRecord = LocalDate.now();
    }

    public Record(Book book) {
        this.status = null;
        this.book = book;
        this.dateRecord = LocalDate.now();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getDateRecord() {
        return dateRecord;
    }

    public void setDateRecord(LocalDate dateRecord) {
        this.dateRecord = dateRecord;
    }

    @Override
    public String toString() {
        return book + " " + dateRecord;
    }
}
