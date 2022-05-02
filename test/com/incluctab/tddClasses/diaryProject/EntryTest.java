package com.incluctab.tddClasses.diaryProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EntryTest {
    @Test
    public void thatEntryCanBeCreated(){
        Entry newEntry = new Entry();
        assertNotNull(newEntry);
    }

    @Test
    public void thatEntryHasDateAndTime(){
        Entry newEntry = new Entry();
        System.out.println(newEntry.getDateAndTime());
        assertNotNull(newEntry.getDateAndTime());
    }

    @Test
    public void thatEntryHasTitle(){
        Entry newEntry = new Entry();
        newEntry.setTitle("Legend of Taichi");
        assertEquals("Legend of Taichi", newEntry.getTitle());
    }

    @Test
    public void thatEntryHasBody(){
        Entry newEntry = new Entry();
        String entryBody = """
                It's the first of all activity;
                The whole of the class is not the whole of the body.
                """;
        newEntry.setBody(entryBody);
        assertEquals(entryBody, newEntry.getBody());
    }
}
