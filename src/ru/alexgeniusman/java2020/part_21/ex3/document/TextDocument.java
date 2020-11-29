package ru.alexgeniusman.java2020.part_21.ex3.document;

public class TextDocument extends Document {

    public TextDocument(Status status) {
        super(status);
    }

    @Override
    public String getType() {
        return "text";
    }

}
