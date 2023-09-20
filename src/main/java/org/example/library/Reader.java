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

    public Book giveAwayBook(String name, String author) {
        Book res = null;
        int index = this.checkBook(name, author);
        if (!(index < 0)) {
            res = books.get(index);
            books.remove(index);
        }
        return res;
    }

    public int checkBook(String name, String author) {
        int res = -1;
        for (int i = 0; i < this.books.size(); i++) {
            if (books.get(i).getName().equals(name) && books.get(i).getAuthor().equals(author)) {
                res = i;
            }
        }
        return res;
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

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String str = new String();
        str += "============\nЧитатель\n";
        str += "---------------------------\n";
        str += lbCard.toString() + "\n";
        str += "---------------------------\n";
        str += "Книги: \n";
        for (Book book:books) {
            str += book.toString() + "\n";
        }
        str += "---------------------------\n";
        return str;
    }
}
