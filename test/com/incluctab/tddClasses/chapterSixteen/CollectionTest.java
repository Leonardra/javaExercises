package com.incluctab.tddClasses.chapterSixteen;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollectionTest {
    @Test
    void test(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        assertEquals(1, numbers.size());
        assertTrue(numbers.contains(45));
//        Collection<Integer> collections = new ArrayList<>();
    }
}
