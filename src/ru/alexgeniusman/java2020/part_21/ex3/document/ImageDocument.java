package ru.alexgeniusman.java2020.part_21.ex3.document;

public class ImageDocument extends Document {

    public ImageDocument(Status status) {
        super(status);
    }

    @Override
    public String getType() {
        return "image";
    }

}
