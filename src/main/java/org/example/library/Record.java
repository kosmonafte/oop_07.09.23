package org.example.library;

import java.time.LocalDate;

public class Record {
    private String readerName;
    private int readerNumber;

    private Book book;
    private LocalDate dateRecord;
    private LocalDate retDate;

    public Record() {
        this.readerName = "readerName";
        this.readerNumber = 9999999;
        this.book = new Book();
        this.dateRecord = LocalDate.now();
        this.retDate = LocalDate.now();
    }

    public Record(String readerName, int readerNumber, Book book, LocalDate dateRecord, LocalDate retDate) {
        this.readerName = readerName;
        this.readerNumber = readerNumber;
        this.book = book;
        this.dateRecord = dateRecord;
        this.retDate = retDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
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

    public LocalDate getDateRecord() {
        return dateRecord;
    }

    public void setDateRecord(LocalDate dateRecord) {
        this.dateRecord = dateRecord;
    }
}
