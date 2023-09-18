package org.example.library;

public class LibraryLife {
    public void start() {
        Library library = new Library();
        library.addBook(new Book("Моряк в седле", "Ирвинг Стоун"));
        library.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков"));
        library.addBook(new Book("Шерлок Холмс", "Артур Конан Дойл"));
    }
}
