package org.example.library;

public class LibraryLife {
    public void start() {
        Library library = new Library();
        library.addBook(new Book("Моряк в седле", "Ирвинг Стоун"));
        library.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков"));
        library.addBook(new Book("Шерлок Холмс", "Артур Конан Дойл"));
        System.out.println(library.toString());
        Human human = new Human("Любитель книг", 30);
        Reader reader = library.createReader(human);
        System.out.println(library.toString());
        System.out.println(reader.toString());
        library.outBook("Шерлок Холмс", "Артур Конан Дойл", reader);
        System.out.println();
        System.out.println(library.toString());
        System.out.println(reader.toString());
    }
}
