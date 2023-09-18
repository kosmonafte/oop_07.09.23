package org.example.library;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

public class Library {
    private ArrayList<Book> books;
    private Journal journal;
    private ArrayList<LibraryCard> libraryCards;

    public Library() {
        this.books = new ArrayList<>();
        this.journal = new Journal();
        this.libraryCards = new ArrayList<>();
    }

    public Library(Journal journal) {
        this.books = new ArrayList<>();
        this.libraryCards = new ArrayList<>();
        this.journal = journal;
    }

    public LibraryCard createCard (Reader reader) {
        this.libraryCards.add(new LibraryCard(reader.getName(), reader.getAge(), libraryCards.size()));
        return this.libraryCards.get(libraryCards.size() - 1);
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
            if (this.books.get(i).getName().equals(name) && this.books.get(i).getAuthor().equals(author)) {
                book = this.books.get(i);
                books.remove(i);
            }
        }
        return book;
    }

    public Journal getJournal() {
        return journal;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }
}
