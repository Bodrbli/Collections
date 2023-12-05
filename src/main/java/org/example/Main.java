package org.example;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        String path = "data/index.json";
        ResultList resultList = new ResultList("ArrayList", 100, new ALImpl(100).start());

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(path), resultList);

        /*System.out.println("ArrayList");
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
        System.out.println(new ADImpl(5000).start());*/
    }
}