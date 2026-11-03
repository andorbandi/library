/*
* File: Sqlite.java
* Author: Szép Andor
* Copyright: 2026, Szép Andor
* Group: Szoft II-N
* Date: 2026-11-03
* Github: https://github.com/andorbandi/
* Licenc: MIT
*/

package com.example.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sqlite implements Database {

    @Override
    public Connection connect() throws SQLException {
        String url = "jdbc:sqlite:library.db";
        return DriverManager.getConnection(url);
    }
}