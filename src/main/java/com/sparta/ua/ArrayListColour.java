package com.sparta.ua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListColour {
    public static void main(String[] args) {

    List<String> colours = new ArrayList<>();
    List<String> coloursClone = new ArrayList<>();
    colours.add("red");
    colours.add("blue");
    colours.add("green");
        System.out.println(colours);
    colours.set(0,"pink");
        System.out.println(colours);
        System.out.println("--------------------------------");
    coloursClone.addAll(colours);
        System.out.println(coloursClone);
        System.out.println("--------------------------------");
        Collections.sort(coloursClone);

        System.out.println(colours);
        System.out.println(coloursClone);
    }
}
