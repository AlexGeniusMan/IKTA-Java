package ru.alexgeniusman.java2020.part_21.ex3.document.factory;

import ru.alexgeniusman.java2020.part_21.ex3.document.Document;
import ru.alexgeniusman.java2020.part_21.ex3.document.MusicDocument;
import ru.alexgeniusman.java2020.part_21.ex3.document.Status;

public class MusicDocumentFactory implements AbstractDocumentFactory {

    @Override
    public Document create() {
        return new MusicDocument(Status.NEW);
    }

    @Override
    public Document open() {
        return new MusicDocument(Status.OPENED);
    }
}
