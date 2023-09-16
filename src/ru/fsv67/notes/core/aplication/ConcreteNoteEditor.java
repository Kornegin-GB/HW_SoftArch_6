package ru.fsv67.notes.core.aplication;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import ru.fsv67.notes.core.aplication.interfaces.NoteEditor;
import ru.fsv67.notes.core.aplication.interfaces.NotesDatabaseContext;
import ru.fsv67.notes.core.aplication.interfaces.NotesPresenter;
import ru.fsv67.notes.core.domain.Note;

public class ConcreteNoteEditor implements NoteEditor {
    private final NotesDatabaseContext dbContext;
    private final NotesPresenter notesPresenter;

    public ConcreteNoteEditor(NotesDatabaseContext dbContext, NotesPresenter notesPresenter) {
        this.dbContext = dbContext;
        this.notesPresenter = notesPresenter;
    }

    @Override
    public boolean add(Note item) {
        dbContext.getAll().add(item);
        return dbContext.saveChanges();
    }

    @Override
    public boolean edit(Note item) {
        if (item == null) {
            return false;
        }
        Optional<Note> note = getById(item.getId());
        if (note.isEmpty()) {
            return false;
        }
        note.get().setTitle(item.getTitle());
        note.get().setDetails(item.getDetails());
        note.get().setEditDate(new Date());
        return dbContext.saveChanges();
    }

    @Override
    public boolean remove(Note item) {
        dbContext.getAll().remove(item);
        return dbContext.saveChanges();
    }

    @Override
    public Optional<Note> getById(Integer id) {
        return dbContext.getAll().stream().filter(p -> p.getId() == id).findFirst();
    }

    @Override
    public Collection<Note> getAll() {
        return dbContext.getAll();
    }

    @Override
    public void printAll() {
        notesPresenter.printAll(getAll());
    }

}
