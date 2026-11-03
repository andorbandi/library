/*
* File: Main.java
* Author: Szép Andor
* Copyright: 2026, Szép Andor
* Group: Szoft II-N
* Date: 2026-11-03
* Github: https://github.com/andorbandi/
* Licenc: MIT
*/

package com.example;

import com.example.controllers.MainController;
import com.example.models.BookService;
import com.example.models.Sqlite;
import com.example.views.BookView;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService(new Sqlite());
        BookView bookView = new BookView();
        MainController mainController = new MainController(bookService, bookView);
        mainController.start();
    }
}