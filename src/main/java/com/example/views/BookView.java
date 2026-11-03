/*
* File: BookView.java
* Author: Szép Andor
* Copyright: 2026, Szép Andor
* Group: Szoft II-N
* Date: 2026-11-03
* Github: https://github.com/andorbandi/
* Licenc: MIT
*/

package com.example.views;

import java.util.List;

import com.example.models.Book;

public class BookView {
    private static final String FORMAT = "%-6s%-22s%-20s%s%n";

    public void printBooks(List<Book> bookList) {
        System.out.printf(FORMAT, "Id", "Cím", "Szerző", "Év");
        for (Book book : bookList) {
            printBook(book);
        }
    }

    private void printBook(Book book) {
        System.out.printf(FORMAT,
            book.getId(),
            book.getTitle(),
            book.getAuthor(),
            book.getYear());
    }

    public void printError(String message) {
        System.err.println("Hiba! " + message);
    }
}