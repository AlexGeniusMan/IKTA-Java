package ru.alexgeniusman.java2020.part_21.ex3.document.factory;

import ru.alexgeniusman.java2020.part_21.ex3.document.Document;

public interface AbstractDocumentFactory {

    Document create();

    Document open();

}
