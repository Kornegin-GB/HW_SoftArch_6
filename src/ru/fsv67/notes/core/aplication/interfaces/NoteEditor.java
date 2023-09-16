package ru.fsv67.notes.core.aplication.interfaces;

import ru.fsv67.notes.core.domain.Note;

public interface NoteEditor extends Editor<Note, Integer> {
    void printAll();
}
