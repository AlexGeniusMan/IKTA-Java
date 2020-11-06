package ru.alexgeniusman.java2020.part_21.ex3;

public class CreateTextDocument implements ICreateDocument {
    public IDocument CreateNew() {
        TextDocument textDocument = new TextDocument();
        return textDocument;
    }
    public IDocument CreateOpen() {
        TextDocument textDocument = new TextDocument();
        return textDocument;
    }
}
