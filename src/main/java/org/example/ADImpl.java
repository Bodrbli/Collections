package org.example;

import java.util.*;

public class ADImpl {
    private static final Random random = new Random();
    private ArrayDeque<String> namesList;
    private ArrayList<Long> nanoTimes = new ArrayList<>();
    public ADImpl(int num) {
        this.namesList = (ArrayDeque<String>) addNames(num);

    }

    private Deque<String> addNames(int num) {

        String[] names = {"Андрей", "Ирина", "Полина", "Татьяна", "Сергей", "Екатерина",
                "Марина", "Николай", "Артем", "Иван", "Павел", "Елена", "Семен", "Роман", "Наталья",
                "Антон", "Александр", "Алексей", "Игорь", "Олеся"};
        Deque<String> namesList = new ArrayDeque<>();
        long start = System.nanoTime();
        for (int i = 0; i < num; i++) {
            namesList.add(names[random.nextInt(0, names.length - 1)]);
        }
        nanoTimes.add(System.nanoTime()-start);
        return namesList;
    }

    private void getFirstNameList() {
        long start = System.nanoTime();
        for (int i = 0; i < namesList.size() * 0.05; i++) {
            namesList.getFirst();
        }
        nanoTimes.add(System.nanoTime() - start);
    }

    private void getLastNameList() {
        long start = System.nanoTime();
        for (int i = namesList.size() - 1; i > namesList.size() * 0.95; i--) {
            namesList.getLast();
        }
        nanoTimes.add(System.nanoTime() - start);
    }

    private void removeFirstNameList() {
        long start = System.nanoTime();
        for (int i = 0; i < namesList.size() * 0.05; i++) {
            namesList.removeFirst();
        }
        nanoTimes.add(System.nanoTime() - start);
    }

    private void removeLastNameList() {
        long start = System.nanoTime();
        for (int i = namesList.size() - 1; i > namesList.size() * 0.95; i--) {
            namesList.removeLast();
        }
        nanoTimes.add(System.nanoTime() - start);
    }

    private void nameReplacement() {
        nanoTimes.add(0L);
    }


    private void removeRandomName() {
        nanoTimes.add(0L);
    }

    public ArrayList<Long> start() {

        getFirstNameList();
        getLastNameList();
        removeFirstNameList();
        removeLastNameList();
        nameReplacement();
        removeRandomName();

        return nanoTimes;
    }
}
