package ru.alexgeniusman.java2020.part_21.ex3.document;

public class MusicDocument extends Document {

    public MusicDocument(Status status) {
        super(status);
    }

    @Override
    public String getType() {
        return "music";
    }

}
