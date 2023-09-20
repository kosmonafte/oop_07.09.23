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

    public int checkBook(String name, String author) {
        int res = -1;
        for (int i = 0; i < books.size(); i++) {
            if (this.books.get(i).getName().equals(name) && this.books.get(i).getAuthor().equals(author)) {
                res = i;
            }
        }
        return res;
    }

    public void outBook(String name, String author, Reader reader) {
        int index = this.checkBook(name, author);
        if (!(index < 0)) {
            reader.addBook(this.books.get(index));
            journal.addOpenRecord(reader.getLbCard(), this.books.get(index));
            reader.getLbCard().addOpenRecord(this.books.get(index));
            books.remove(index);
        }
    }

    public void returnBook(String name, String author, Reader reader) {
        int index = reader.checkBook(name, author);
        if (!(index < 0)) {
            journal.addCloseRecord(reader.getLbCard(), reader.getBooks().get(index));
            reader.getLbCard().addCloseRecord(reader.getBooks().get(index));
            this.addBook(reader.giveAwayBook(name, author));
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
        str += "===========================\nБИБИЛОТЕКА\n";
        str += "---------------------------\n";
        str += "Список книг: \n";
        for (Book book:this.books) {
            str += book.toString() + "\n";
        }
        str += "---------------------------\n";
        str += "Читательские билеты: \n";
        for (LibraryCard card:this.libraryCards) {
            str += card.getNumber() + ". Дата выдачи: " + card.getCreationDate() + " Имя держателя: " + card.getName() + "\n";
        }
        str += "---------------------------\n";

        str += this.journal.toString();
        str += "---------------------------\n";
        return str;
    }
}
