package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("ArrayList");
        System.out.println(new ALImpl(100).start());
        System.out.println(new ALImpl(2000).start());
        System.out.println(new ALImpl(5000).start());

        System.out.println("LinkedList");
        System.out.println(new LLImpl(100).start());
        System.out.println(new LLImpl(2000).start());
        System.out.println(new LLImpl(5000).start());

        System.out.println("Stack");
        System.out.println(new StackImpl(100).start());
        System.out.println(new StackImpl(2000).start());
        System.out.println(new StackImpl(5000).start());

        System.out.println("ArrayDeque");
        System.out.println(new ADImpl(100).start());
        System.out.println(new ADImpl(2000).start());
        System.out.println(new ADImpl(5000).start());
    }
}