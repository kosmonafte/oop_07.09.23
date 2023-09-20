package org.example.library;

import java.time.LocalDate;

public class OpenCardRecord extends Record {
    private LocalDate retDate;

    public OpenCardRecord() {
        super();
        this.retDate = LocalDate.now().plusDays(10);
    }

    public OpenCardRecord(Book book, int days) {
        super(book);
        this.status = "Получено";
        this.retDate = LocalDate.now().plusDays(days);
    }

    public LocalDate getRetDate() {
        return retDate;
    }

    public void setRetDate(LocalDate retDate) {
        this.retDate = retDate;
    }

    @Override
    public String toString() {
        return  this.status + "\t" + book + "\t\t" + dateRecord + "\t\t" + retDate;
    }
}
