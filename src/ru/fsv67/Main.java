package ru.fsv67;

import ru.fsv67.database.NotesDatabase;
import ru.fsv67.notes.core.aplication.ConcreteNoteEditor;
import ru.fsv67.notes.infrastructure.persistance.NotesDbContext;
import ru.fsv67.notes.presentation.queries.contollers.NotesController;
import ru.fsv67.notes.presentation.queries.views.NotesConsolePresenter;

public class Main {

    public static void main(String[] args) {
        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));
        controller.routeGetAll();
    }

}
