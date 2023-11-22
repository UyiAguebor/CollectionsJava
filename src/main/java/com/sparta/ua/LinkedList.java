package com.sparta.ua;

import java.util.Iterator;

public class LinkedList {
    public static void main(String[] args) {

        java.util.LinkedList<String> linkedlist = new java.util.LinkedList<>();

        linkedlist.add("London");
        linkedlist.add("Tokyo");
        linkedlist.add("Los Angeles");

        System.out.println(linkedlist);
        for(String city: linkedlist){
            System.out.println(city);
        }

        Iterator<String> descendingIterator = linkedlist.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

        int n = linkedlist.size();
        System.out.println(linkedlist.get(n - 1));


        System.out.println(linkedlist.get(0));
        linkedlist.remove(0);

        linkedlist.set(1,"Lagos");

        System.out.println(linkedlist);
    }
}
