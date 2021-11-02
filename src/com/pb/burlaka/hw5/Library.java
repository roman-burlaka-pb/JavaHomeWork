package com.pb.burlaka.hw5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 1, "ФИОТ", "05.12.1986", "+8067123456");
        Reader[] readers = {reader1};

        Book book1 = new Book("Приключения", "Иванов И. И.", "2000 г.");
        Book book2 = new Book("Словарь", "Сидоров А. В.","1980 г.");
        Book book3 = new Book("Энциклопедия", "Гусев К. В.", "2010 г.");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(3);
        reader1.takeBook(book1.getName(), book2.getName(), book3.getName());
        reader1.takeBook(book1, book2,book3);

        reader1.returnBook(3);
        reader1.returnBook(book1.getName(), book2.getName(), book3.getName());
        reader1.returnBook(book1, book2,book3);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}
