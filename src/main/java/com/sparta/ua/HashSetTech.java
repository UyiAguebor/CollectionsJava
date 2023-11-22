package com.sparta.ua;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTech {
    public static void main(String[] args) {
        Set<String> setTech = new HashSet<>();

        setTech.add("Microsoft");
        setTech.add("Amazon");
        setTech.add("Sony");
        setTech.add("Google");

        System.out.println(setTech.size());

        TreeSet<String> treeSetTech = new TreeSet<>(setTech);
        System.out.println(setTech);
        System.out.println(treeSetTech);

        System.out.println();


        for (String tech : setTech) {
            if (tech.length() < 7) {
                System.out.println(tech);
            }
        }

        System.out.println(setTech.isEmpty());

        Iterator<String> iterator = setTech.iterator();
        if (iterator.hasNext()) {
            String firstElement = iterator.next();
            setTech.remove(firstElement);
            System.out.println("First element: " + firstElement);
        } else {
            System.out.println("HashSet is empty");
        }

        Iterator<String> iterator1 = treeSetTech.iterator();
        if (iterator.hasNext()) {
            String firstElement = iterator.next();
            treeSetTech.remove(firstElement);
            System.out.println("First element: " + firstElement);
        } else {
            System.out.println("HashSet is empty");
        }

    }
}
