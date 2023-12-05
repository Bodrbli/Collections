package org.example;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.io.Serializable;
import java.util.ArrayList;

@JsonAutoDetect
public class ResultList implements Serializable {
    public String collectionName;
    public int countElement;
    public ArrayList<Long> result;

    public ResultList(String collectionName, int countElement, ArrayList<Long> result) {
        this.collectionName = collectionName;
        this.countElement = countElement;
        this.result = result;
    }
}
