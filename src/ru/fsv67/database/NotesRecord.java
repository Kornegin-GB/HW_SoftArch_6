package ru.fsv67.database;

import java.util.Date;

public class NotesRecord {
    private static int counter = 1000;

    {
        id = ++counter;
    }

    public NotesRecord(String title, String details) {
        this.title = title;
        this.details = details;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    private int id;
    private int userId;
    private String title;
    private String details;
    private Date creationDate;
    private Date editDate;
}
