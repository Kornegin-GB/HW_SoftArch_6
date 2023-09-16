package ru.fsv67.notes.core.aplication.interfaces;

import java.util.Collection;

import ru.fsv67.notes.core.domain.Note;

public interface NotesDatabaseContext {
    Collection<Note> getAll();

    boolean saveChanges();
}
