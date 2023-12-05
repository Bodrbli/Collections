package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class StackImpl {
    private static final Random random = new Random();
    private Stack<String> namesList;
    private ArrayList<Long> nanoTimes = new ArrayList<>();
    public StackImpl(int num) {
        this.namesList = (Stack<String>) addNames(num);

    }

    private Stack<String> addNames(int num) {

        String[] names = {"Андрей", "Ирина", "Полина", "Татьяна", "Сергей", "Екатерина",
                "Марина", "Николай", "Артем", "Иван", "Павел", "Елена", "Семен", "Роман", "Наталья",
                "Антон", "Александр", "Алексей", "Игорь", "Олеся"};
        Stack<String> namesList = new Stack<>();
        long start = System.nanoTime();
        for (int i = 0; i < num; i++) {
            namesList.push(names[random.nextInt(0, names.length - 1)]);
        }
        //System.out.println("timesAddName" + namesList.size() + "=" + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime()-start);
        return namesList;
    }

    private void getFirstNameList() {
        long start = System.nanoTime();
        for (int i = 0; i < namesList.size() * 0.05; i++) {
            namesList.get(i);
        }
        //System.out.println("timesGetFirst" + namesList.size() + "=" + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
    }

    private void getLastNameList() {
        long start = System.nanoTime();
        for (int i = namesList.size() - 1; i > namesList.size() * 0.95; i--) {
            namesList.get(i);
        }
        //System.out.println("timesGetLast" + namesList.size() + "=" + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
    }

    private void removeFirstNameList() {
        long start = System.nanoTime();
        for (int i = 0; i < namesList.size() * 0.05; i++) {
            namesList.remove(i);
        }
        //System.out.println("timesRemoveFirst" + namesList.size() + "=" + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
    }

    private void removeLastNameList() {
        long start = System.nanoTime();
        for (int i = namesList.size() - 1; i > namesList.size() * 0.95; i--) {
            namesList.remove(i);
        }
        //System.out.println("timesRemoveLast" + namesList.size() + "=" + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
    }

    private void nameReplacement() {
        long start = System.nanoTime();
        //System.out.println("22- " + namesList.size());
        namesList.set(random.nextInt(0, namesList.size() - 1), "Jack");
        //System.out.println("timesReplace" + namesList.size() + "=" + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
    }


    private void removeRandomName() {
        long start = System.nanoTime();
        namesList.remove("Jack");
        //System.out.println("timesRemoveRandomName=" + namesList.size() + (System.nanoTime() - start));
        nanoTimes.add(System.nanoTime() - start);
    }

    public ArrayList<Long> start() {

        getFirstNameList();
        getLastNameList();
        removeFirstNameList();
        removeLastNameList();
        nameReplacement();
        removeRandomName();
        //System.out.println();

        return nanoTimes;
    }
}
