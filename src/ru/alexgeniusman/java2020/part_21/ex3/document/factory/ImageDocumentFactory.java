package ru.alexgeniusman.java2020.part_21.ex3.document.factory;

import ru.alexgeniusman.java2020.part_21.ex3.document.Document;
import ru.alexgeniusman.java2020.part_21.ex3.document.ImageDocument;
import ru.alexgeniusman.java2020.part_21.ex3.document.Status;

public class ImageDocumentFactory implements AbstractDocumentFactory {

    @Override
    public Document create() {
        return new ImageDocument(Status.NEW);
    }

    @Override
    public Document open() {
        return new ImageDocument(Status.OPENED);
    }
}
