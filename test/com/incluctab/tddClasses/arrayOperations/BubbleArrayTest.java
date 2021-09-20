package com.incluctab.tddClasses.arrayOperations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleArrayTest {

    private ArraySorter sorter;
    @BeforeEach
    void setUp() {
        sorter = new BubbleArray();

    }

    @Test
    void sortWithoutAnArray(){
        assertThrows(ArraySorterException.class,()-> sorter.sortAscending(null));
    }

    @Test
    void testThatBubbleArrayCanSort() {
        int[] number = {10, 0, 3, 1, 6, 4};
        int[] expected = {0, 1, 3, 4, 6, 10};
        int[] methodOutput = {0, 1, 3, 4, 6, 10};
        try {
            methodOutput = sorter.sortAscending(number);
        } catch (ArraySorterException e) {
            e.getLocalizedMessage();
        }
        assertArrayEquals(expected, methodOutput);
    }

    @Test
    void testThatBubbleArrayCanSortInDescendingOrder(){
        int[] number = {10, 0, 3, 1, 6, 4};
        int[] expected = {10, 6, 4, 3, 1, 0};
        int[] methodOutput = {10, 6, 4, 3, 1, 0};
        try {
            methodOutput = sorter.sortDescending(number);
        } catch (ArraySorterException e) {
            e.getLocalizedMessage();
        }
        assertArrayEquals(expected, methodOutput);
    }

}