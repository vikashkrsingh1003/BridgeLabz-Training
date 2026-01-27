package com.jtest.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.jtest.main.DatabaseConnection;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {

    private DatabaseConnection db;

    @BeforeEach
    public void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    public void tearDown() {
        db.disconnect();
    }

    @Test
    public void testConnectionEstablished() {
        assertTrue(db.isConnected(), "Database should be connected before test");
    }

    @Test
    public void testConnectionClosedAfterTest() {
        db.disconnect();
        assertFalse(db.isConnected(), "Database should be disconnected");
    }
}

