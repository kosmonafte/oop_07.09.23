package org.example.library;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

public class Library {
    private ArrayList<Book> books;
    private Journal journal;
    private ArrayList<LibraryCard> libraryCards;
    private int countCard;

    public Library() {
        this.books = new ArrayList<>();
        this.journal = new Journal();
        this.libraryCards = new ArrayList<>();
        this.countCard = 1;
    }

    public Library(Journal journal) {
        this.books = new ArrayList<>();
        this.libraryCards = new ArrayList<>();
        this.journal = journal;
        this.countCard = 1;
    }

    public LibraryCard createCard (Human human) {
        LibraryCard librCard = new LibraryCard(human.getName(), human.getAge(), countCard);
        this.libraryCards.add(librCard);
        return librCard;
    }

    public Reader createReader(Human human) {
        Reader reader = new Reader(human.getName(), human.getAge(), createCard(human));
        return reader;
    }

    public boolean checkBook(String name, String author) {
        boolean res = false;
        for (int i = 0; i < books.size(); i++) {
            if (this.books.get(i).getName().equals(name) && this.books.get(i).getAuthor().equals(author)) {
                res = true;
            }
        }
        return res;
    }

    public void outBook(String name, String author, Reader reader) {
        if (this.checkBook(name, author)) {
            for (int i = 0; i < books.size(); i++) {
                if (this.books.get(i).getName().equals(name) && this.books.get(i).getAuthor().equals(author)) {
                    reader.addBook(this.books.get(i));
                    journal.addRecord(reader.getLbCard(), this.books.get(i));
                    reader.getLbCard().addRecord(this.books.get(i));
                    books.remove(i);
                }
            }
        }
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



    public Journal getJournal() {
        return journal;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    @Override
    public String toString() {
        String str = new String();
        str += "Список книг: \n";
        for (Book book:this.books) {
            str += book.getAuthor() + ": " + book.getName() + "\n";
        }
        str += "Читательские билеты: \n";
        for (LibraryCard card:this.libraryCards) {
            str += "Имя: "+card.getName() + " Возраст: " + card.getAge() + " Номер читательского билета: " + card.getNumber() + "\n";
        }
        return str;
    }
}
