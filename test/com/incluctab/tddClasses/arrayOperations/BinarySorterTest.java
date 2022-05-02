package com.incluctab.tddClasses.arrayOperations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySorterTest {

    private ArraySorter binarySort;
    @BeforeEach
    void setUp() {
        binarySort  = new BinarySorter();
    }

    @Test
    void sortWithoutAnArray(){
        assertThrows(ArraySorterException.class,()-> binarySort.sortAscending(null));
    }

    @Test
    void testThatBubbleArrayCanSort() {
        int[] number = {10, 0, 3, 1, 6, 4};
        int[] expected = {0, 1, 3, 4, 6, 10};
        int[] methodOutput = {0, 1, 3, 4, 6, 10};
        try {
            methodOutput = binarySort.sortAscending(number);
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
            methodOutput = binarySort.sortDescending(number);
        } catch (ArraySorterException e) {
            e.getLocalizedMessage();
        }
        assertArrayEquals(expected, methodOutput);
    }
}