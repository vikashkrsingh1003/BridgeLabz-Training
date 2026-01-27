package com.jtest.test;

import org.junit.jupiter.api.Test;

import com.jtest.main.ListManager;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {

    @Test
    public void testAddElement() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 5);
        assertEquals(1, list.size());
        assertTrue(list.contains(5));
    }

    @Test
    public void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        ListManager.removeElement(list, 10);
        assertEquals(1, list.size());
        assertFalse(list.contains(10));

        // Removing element not present
        ListManager.removeElement(list, 100);
        assertEquals(1, list.size());
    }

    @Test
    public void testGetSize() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, ListManager.getSize(list));

        list.add(1);
        list.add(2);
        assertEquals(2, ListManager.getSize(list));

        assertEquals(0, ListManager.getSize(null)); // null list returns 0
    }
}

