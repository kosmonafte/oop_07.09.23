package org.example.library;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void delBook(int index) {
        this.books.remove(index);
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    public Book outBook(String name, String author) {
        Book book = null;
        for (int i = 0; i < books.size(); i++) {
            if (this.books.get(i).getName() == name && this.books.get(i).getAuthor() == author) {
                book = this.books.get(i);
                books.remove(i);
            }
        }
        return book;
    }
}
