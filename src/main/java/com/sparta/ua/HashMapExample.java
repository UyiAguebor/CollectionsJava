package com.sparta.ua;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> hash = new HashMap<>();

        hash.put(1,"Henry");
        hash.put(2,"Harry");
        hash.put(3,"Jake");
        hash.put(4,"Finn");
        hash.put(5,"Jack");
        hash.put(6,"Jaden");

        System.out.println(hash);

        System.out.println(hash.containsValue("*e*"));
    }
}
