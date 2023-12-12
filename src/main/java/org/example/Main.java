package org.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Values> toJson = List.of(
        ProcessingValues.resultValues(100, "ArrayList"),
        ProcessingValues.resultValues(2000, "ArrayList"),
        ProcessingValues.resultValues(5000, "ArrayList"),

        ProcessingValues.resultValues(100, "LinkedList"),
        ProcessingValues.resultValues(2000, "LinkedList"),
        ProcessingValues.resultValues(5000, "LinkedList"),

        ProcessingValues.resultValues(100, "Stack"),
        ProcessingValues.resultValues(2000, "Stack"),
        ProcessingValues.resultValues(5000, "Stack"),

        ProcessingValues.resultValues(100, "ArrayDeque"),
        ProcessingValues.resultValues(2000, "ArrayDeque"),
        ProcessingValues.resultValues(5000, "ArrayDeque")
        );
        Dump.getDump(toJson);
    }
}