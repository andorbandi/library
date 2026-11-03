/*
* File: MainController.java
* Author: Szép Andor
* Copyright: 2026, Szép Andor
* Group: Szoft II-N
* Date: 2026-11-03
* Github: https://github.com/andorbandi/
* Licenc: MIT
*/

package com.example.controllers;

import java.sql.SQLException;

import com.example.models.BookService;
import com.example.views.BookView;

public class MainController {
    private BookService bookService;
    private BookView bookView;

    public MainController(BookService bookService, BookView bookView) {
        this.bookService = bookService;
        this.bookView = bookView;
    }

    public void start() {
        try {
            bookView.printBooks(bookService.getBooks());
        } catch (SQLException e) {
            bookView.printError(e.getMessage());
        }
    }
}