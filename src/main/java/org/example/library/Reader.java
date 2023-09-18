package org.example.library;

import java.util.ArrayList;

public class Reader extends Human {
    private ArrayList<Book> books;
    private LibraryCard lbCard;

    public Reader(String name, int age, LibraryCard lbCard) {
        super(name, age);
        this.books = new ArrayList<>();
        this.lbCard = lbCard;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

//    public Book outBook(String name, String author) {
//        Book book = null;
//        for (int i = 0; i < this.books.size(); i++) {
//            if (books.get(i).getName().equals(name) && books.get(i).getAuthor().equals(author)) {
//                book = books.get(i);
//                this.books.remove(i);
//                this.lbCard
//            }
//        }
//        return book;
//    }

    public LibraryCard getLbCard() {
        return lbCard;
    }

    public void setLbCard(LibraryCard lbCard) {
        this.lbCard = lbCard;
    }

    @Override
    public String toString() {
        return this.name + "\n" + books + "\n" + lbCard;
    }
}
