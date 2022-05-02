package com.incluctab.tddClasses.diaryProject;

import java.time.LocalDateTime;

public class Entry {
    private LocalDateTime entryDateTime;
    private String title;
    private String body;

    public Entry(){
        entryDateTime = LocalDateTime.now();
    }

    public LocalDateTime getDateAndTime() {
        return entryDateTime;
    }

    public void setTitle(String entryTitle) {
        title = entryTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setBody(String entryBody) {
        body = entryBody;
    }

    public String getBody() {
        return body;
    }
}
