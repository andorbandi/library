/*
* File: BookService.java
* Author: Szép Andor
* Copyright: 2026, Szép Andor
* Group: Szoft II-N
* Date: 2026-11-03
* Github: https://github.com/andorbandi/
* Licenc: MIT
*/

package com.example.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookService {
    private Database database;

    public BookService(Database database) {
        this.database = database;
    }

    public List<Book> getBooks() throws SQLException {
        String sql = "SELECT * FROM books";
        try (Connection con = database.connect();
                Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)) {
            return toBookList(resultSet);
        }
    }

    private List<Book> toBookList(ResultSet resultSet) throws SQLException {
        List<Book> bookList = new ArrayList<>();
        while (resultSet.next()) {
            bookList.add(toBook(resultSet));
        }
        return bookList;
    }

    private Book toBook(ResultSet resultSet) throws SQLException {
        return new Book(
            resultSet.getInt("id"),
            resultSet.getString("title"),
            resultSet.getString("author"),
            resultSet.getInt("year"),
            resultSet.getInt("pages")
        );
    }
}