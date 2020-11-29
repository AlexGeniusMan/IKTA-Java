package ru.alexgeniusman.java2020.part_21.ex3.document.factory;

import ru.alexgeniusman.java2020.part_21.ex3.document.Document;
import ru.alexgeniusman.java2020.part_21.ex3.document.Status;
import ru.alexgeniusman.java2020.part_21.ex3.document.TextDocument;

public class TextDocumentFactory implements AbstractDocumentFactory {

    @Override
    public Document create() {
        return new TextDocument(Status.NEW);
    }

    @Override
    public Document open() {
        return new TextDocument(Status.OPENED);
    }
}
