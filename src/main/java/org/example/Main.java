package org.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<List<Long>> toJson = List.of(
        ProcessingValues.resultValues(100, "ArrayList"),
        ProcessingValues.resultValues(2000, "ArrayList"),
        ProcessingValues.resultValues(5000, "ArrayList"),

        ProcessingValues.resultValues(5000, "LinkedList"),
        ProcessingValues.resultValues(5000, "LinkedList"),
        ProcessingValues.resultValues(5000, "LinkedList"),

        ProcessingValues.resultValues(5000, "Stack"),
        ProcessingValues.resultValues(5000, "Stack"),
        ProcessingValues.resultValues(5000, "Stack")

        /*ProcessingValues.resultValues(5000, "ArrayDeque"),
        ProcessingValues.resultValues(5000, "ArrayDeque"),
        ProcessingValues.resultValues(5000, "ArrayDeque")*/
        );
        Dump.getDump(toJson);
    }
}