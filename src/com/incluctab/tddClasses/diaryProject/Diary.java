package com.incluctab.tddClasses.diaryProject;

import java.util.ArrayList;

public class Diary {

    private ArrayList<Entry> entries;
    private String title;

    public Diary(String title){
        this.title = title;
        entries = new ArrayList<>();
    }

    public void addEntry(Entry newEntry) {
        entries.add(newEntry);
    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public void addEntry(String entryTitle, String entryBody) {
        Entry newEntry = new Entry();
        newEntry.setTitle(entryTitle);
        newEntry.setBody(entryBody);
        entries.add(newEntry);
    }

    public String getTitle() {
        return title;
    }

    public Entry findEntryByTitle(String title) {
        Entry newEntry = new Entry();
        newEntry.setTitle(title);

        for (Entry entry: entries) {
            if(entry.getTitle().equals(title)){
                return entry;
            }

        }return null;
    }

    public void deleteEntryByTitle(String title) {
         Entry foundEntry = findEntryByTitle(title);
         entries.remove(foundEntry);
    }

    public void changeDiaryTitle(String title) {
        this.title= title;
    }

    public void viewAllEntries(){
        for (Entry entry : entries) {
            String.format("%10s",entry.getTitle(),"\n%50s");
//            System.out.print(entry.toString());
        }
    }
}
