package com.incluctab.tddClasses.diaryProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    @Test
    public void testThatDiaryCanBeCreated(){
        Diary diary = new Diary("The Diary of Sunkanmi");
        assertNotNull(diary);
    }
    
    @Test
    public void testThatDiaryCanAddEntry(){
        Diary diary = new Diary("The Diary of Sunkanmi");
        Entry newEntry = new Entry();
        diary.addEntry(newEntry);
        assertEquals(1, diary.getNumberOfEntries());
    }

    @Test
    public void testThatDiaryCanAddEntryByTitleAndBody(){
        Diary diary = new Diary("The Diary of Sunkanmi");
        diary.addEntry("Title", "Body is long...");
        assertEquals(1, diary.getNumberOfEntries());
    }

    @Test
    public void thatThatDiaryCanSetTitle(){
        Diary newDiary = new Diary("The Diary of Sunkanmi");
        assertEquals("The Diary of Sunkanmi", newDiary.getTitle());
    }

    @Test
    public void thatEntriesCanBeSearchedByTitle(){
        Diary newDiary = new Diary("The diary");
        Entry newEntry = new Entry();
        newEntry.setTitle("The Battle");
        newDiary.addEntry(newEntry);
        Entry foundEntry = newDiary.findEntryByTitle("The Battle");
        assertEquals(newEntry, foundEntry);
    }

    @Test
    public void thatEntriesCanBeDeleted(){
        Diary newDiary = new Diary("The Battle");
        Entry newEntry = new Entry();
        newEntry.setTitle("The story of my life");
        newDiary.addEntry(newEntry);
        newDiary.addEntry("The fuckery involved", "Turn to page 2");
        assertEquals(2, newDiary.getNumberOfEntries());
        newDiary.deleteEntryByTitle("The fuckery involved");
        assertEquals(1, newDiary.getNumberOfEntries());
    }

    @Test
    public void thatDiaryCanUpadateOrChangeName(){
        Diary newDiary = new Diary("The beatle");
        assertEquals("The beatle", newDiary.getTitle());
        newDiary.changeDiaryTitle("Next beatle");
        assertEquals("Next beatle", newDiary.getTitle());
    }
}
