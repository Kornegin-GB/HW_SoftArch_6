package ru.fsv67.database;

import ru.fsv67.notes.infrastructure.persistance.Database;

public class NotesDatabase implements Database {
    private NotesTable notesTable;

    public NotesTable getNotesTable() {
        if (notesTable == null) {
            notesTable = new NotesTable();
        }
        return notesTable;
    }
}
