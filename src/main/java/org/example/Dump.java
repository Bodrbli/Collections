package org.example;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

@JsonAutoDetect
public class Dump implements Serializable {
    static String path = "data/index.json";
    public static void getDump( List<Values> list) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(path), list);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

}
