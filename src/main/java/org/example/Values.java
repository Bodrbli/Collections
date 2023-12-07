package org.example;

import java.util.List;

public class Values { //преобразование списка замеров в объект класса с полями идентичными данным
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
