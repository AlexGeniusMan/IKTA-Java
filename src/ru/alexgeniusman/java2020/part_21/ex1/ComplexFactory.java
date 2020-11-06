package ru.alexgeniusman.java2020.part_21.ex1;

public abstract class ComplexFactory implements ComplexAbstractFactory {
    public abstract Complex createComplex();
    public abstract Complex CreateComplex(int real, int image);
}
