package org.example.library;

import java.time.LocalDate;

public class CloseCardRecord extends Record {

    public CloseCardRecord() {
        super();
    }

    public CloseCardRecord(Book book) {
        super(book);
        this.status = "Возвращено";
    }

    @Override
    public String toString() {
        return  this.status + "\t" + book + "\t\t" + dateRecord;
    }
}
