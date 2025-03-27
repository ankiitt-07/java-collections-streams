package com.testing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.testing.list_operations.ListManager.*;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {
    private static List<Integer> list;

    @BeforeAll
    public static void setUp() {
        list = new ArrayList<Integer>();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 5, 6, 1})
    void testAddElement(int element) {
        addElement(list, element);
        Assertions.assertTrue(list.contains(element));
    }

    @Test
    void testRemoveElement() {
        list.add(10);
        removeElement(list, 10);
        Assertions.assertFalse(list.contains(10));
    }

    @Test
    void testGetSize() {
        Assertions.assertEquals(4, getSize(list));
    }
}
