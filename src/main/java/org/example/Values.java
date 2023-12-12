package org.example;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;

public class Values { //преобразование списка замеров в объект класса с полями идентичными данным
    String listName;
    int num;
    long fillCollection;
    long first5Percent;
    long last5Percent;
    long removeFirst;
    long removeLast;
    long setName;
    long removeName;

    public Values(List<Long> nanoTimes) { //конструктор
        this.fillCollection = nanoTimes.get(0);
        this.first5Percent = nanoTimes.get(1);
        this.last5Percent = nanoTimes.get(2);
        this.removeFirst = nanoTimes.get(3);
        this.removeLast = nanoTimes.get(4);
        this.setName = nanoTimes.get(5);
        this.removeName = nanoTimes.get(6);
    }

    public Values(String listName, int num,  long fillCollection, // перегруженный конструктор объекта для отправки в json
                                             long first5Percent,
                                             long last5Percent,
                                             long removeFirst,
                                             long removeLast,
                                             long setName,
                                             long removeName) {
        this.listName = listName;
        this.num = num;
        this.fillCollection = fillCollection;
        this.first5Percent = first5Percent;
        this.last5Percent = last5Percent;
        this.removeFirst = removeFirst;
        this.removeLast = removeLast;
        this.setName = setName;
        this.removeName = removeName;
    }
    @JsonGetter("ListName")
    public String getListName() {
        return listName;
    }
    @JsonGetter("Num")
    public int getNum() {
        return num;
    }
    @JsonGetter("FillCollection")
    public long getFillCollection() {
        return fillCollection;
    }
    @JsonGetter("First5Percent")
    public long getFirst5Percent() {
        return first5Percent;
    }
    @JsonGetter("Last5Percent")
    public long getLast5Percent() {
        return last5Percent;
    }
    @JsonGetter("RemoveFirst")
    public long getRemoveFirst() {
        return removeFirst;
    }
    @JsonGetter("RemoveLast")
    public long getRemoveLast() {
        return removeLast;
    }
    @JsonGetter("SetName")
    public long getSetName() {
        return setName;
    }
    @JsonGetter("RemoveName")
    public long getRemoveName() {
        return removeName;
    }

    @Override
    public String toString() {
        return "Values{" +
                "fillCollection=" + fillCollection +
                ", first5Percent=" + first5Percent +
                ", last5Percent=" + last5Percent +
                ", removeFirst=" + removeFirst +
                ", removeLast=" + removeLast +
                ", setName=" + setName +
                ", removeName=" + removeName +
                '}';
    }
}
