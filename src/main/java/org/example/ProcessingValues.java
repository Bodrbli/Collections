package org.example;

import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.*;

public class ProcessingValues {
    String listType;
    private static List<Values> valuesList;
    private static ArrayDeque<Values> valueArrayDeque;
    private long[] fillCollectionArray = new long[5];
    private long[] first5PercentArray = new long[5];
    private long[] last5PercentArray = new long[5];
    private long[] removeFirstArray = new long[5];
    private long[] removeLastArray = new long[5];
    private long[] setNameArray = new long[5];
    private long[] removeNameArray = new long[5];

    public ProcessingValues(List<Values> valuesList, String listType) { //конструктор класса сортирующий значения по соответствующим массивам
        this.listType = listType;
        for (int i = 0; i < valuesList.size(); i++) {
            this.fillCollectionArray[i] = valuesList.get(i).fillCollection;
            this.first5PercentArray[i] = valuesList.get(i).first5Percent;
            this.last5PercentArray[i] = valuesList.get(i).last5Percent;
            this.removeFirstArray[i] = valuesList.get(i).removeFirst;
            this.removeLastArray[i] = valuesList.get(i).removeLast;
            this.setNameArray[i] = valuesList.get(i).setName;
            this.removeNameArray[i] = valuesList.get(i).removeName;
        }
    }

    public static Values/*List<Long>*/ resultValues(int num, String listType) { //инициализация списка со средними значениями
    ProcessingValues processingValues = new ProcessingValues(get5value(num, listType), listType);

        /*List<Long> result = Arrays.asList(
                ProcessingValues.getMidValue(processingValues.fillCollectionArray),
                ProcessingValues.getMidValue(processingValues.first5PercentArray),
                ProcessingValues.getMidValue(processingValues.last5PercentArray),
                ProcessingValues.getMidValue(processingValues.removeFirstArray),
                ProcessingValues.getMidValue(processingValues.removeLastArray),
                ProcessingValues.getMidValue(processingValues.setNameArray),
                ProcessingValues.getMidValue(processingValues.removeNameArray)
        );
        return result;*/
        Values midValue = new Values(listType, num,  ProcessingValues.getMidValue(processingValues.fillCollectionArray),
                                                     ProcessingValues.getMidValue(processingValues.first5PercentArray),
                                                     ProcessingValues.getMidValue(processingValues.last5PercentArray),
                                                     ProcessingValues.getMidValue(processingValues.removeFirstArray),
                                                     ProcessingValues.getMidValue(processingValues.removeLastArray),
                                                     ProcessingValues.getMidValue(processingValues.setNameArray),
                                                     ProcessingValues.getMidValue(processingValues.removeNameArray));
        return midValue;
    }
    private static List<Values> get5value(int num, String listType) { // проводим 5 замеров

        if (listType.equals("ArrayList")) {
            valuesList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                Values values = new Values(new ALImpl(num).start());
                valuesList.add(values);
            }
        } else if (listType.equals("LinkedList")) {
            valuesList = new LinkedList<>();
            for (int i = 0; i < 5; i++) {
                Values values = new Values(new LLImpl(num).start());
                valuesList.add(values);
            }
        } else if (listType.equals("Stack")) {
            valuesList = new Stack<>();
            for (int i = 0; i < 5; i++) {
                Values values = new Values(new StackImpl(num).start());
                valuesList.add(values);
            }
        }
        return valuesList;
    }
    /*private static ArrayDeque<Values> get5value(int num, String listType, int count) { // проводим 5 замеров

            valueArrayDeque = new ArrayDeque<>();
            for (int i = 0; i < count; i++) {
                Values values = new Values(new LLImpl(num).start());
                valuesList.add(values);
            }
        return valueArrayDeque;
    }*/

    private static Long getMidValue(long[] array) { // вычисление среднего значения для 5 замеров

        return Arrays.stream(array).sum()/5;
    }

    // геттеры
    public long[] getFillCollectionArray() {
        return fillCollectionArray;
    }

    public long[] getFirst5PercentArray() {
        return first5PercentArray;
    }

    public long[] getLast5PercentArray() {
        return last5PercentArray;
    }

    public long[] getRemoveFirstArray() {
        return removeFirstArray;
    }

    public long[] getRemoveLastArray() {
        return removeLastArray;
    }

    public long[] getSetNameArray() {
        return setNameArray;
    }

    public long[] getRemoveNameArray() {
        return removeNameArray;
    }

    @Override
    public String toString() {
        return "ProcessingValues{" +
                "fillCollectionArray=" + Arrays.toString(fillCollectionArray) +
                ", first5PercentArray=" + Arrays.toString(first5PercentArray) +
                ", last5PercentArray=" + Arrays.toString(last5PercentArray) +
                ", removeFirstArray=" + Arrays.toString(removeFirstArray) +
                ", removeLastArray=" + Arrays.toString(removeLastArray) +
                ", setNameArray=" + Arrays.toString(setNameArray) +
                ", removeNameArray=" + Arrays.toString(removeNameArray) +
                '}';
    }
}
