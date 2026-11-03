/*
* File: Database.java
* Author: Szép Andor
* Copyright: 2026, Szép Andor
* Group: Szoft II-N
* Date: 2026-11-03
* Github: https://github.com/andorbandi/
* Licenc: MIT
*/

package com.example.models;

import java.sql.Connection;
import java.sql.SQLException;

public interface Database {
    Connection connect() throws SQLException;
}