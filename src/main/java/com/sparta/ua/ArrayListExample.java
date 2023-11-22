package com.sparta.ua;

import java.util.List;


public class ArrayListExample
{
    public static void main( String[] args ){

        //Allow for duplicated elements and can be iterated through
        //Allows for dynamic resizing

        List<Integer> arrayList =  new java.util.ArrayList<>();

        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(76);
        arrayList.add(7);


        System.out.println("Here is the initial Array List: ");
        System.out.println(arrayList);
        System.out.println("--------------------------------- ");

        //changes 76 as it is in index 4 to a new integer 8
        arrayList.set(4,8);

        //prints out the changed list
        System.out.println("changed 76 to 8 using: \"arrayList.set(4,8)\"");
        System.out.println(arrayList);
        System.out.println("--------------------------------- ");

        //prints out the length of the list
        System.out.println("This returns the length of the arraylist using \"arrayList.size()\": ");
        System.out.println(arrayList.size());
        System.out.println("--------------------------------- ");

        //removes the fourth index which is the 8
        arrayList.remove(4);

        System.out.println("Here we have removed the integer at index 4 using \"arrayList.remove(4)\": ");
        System.out.println(arrayList);
        System.out.println("--------------------------------- ");

        //adds null to the array
        arrayList.add(null);

        System.out.println("Here Array List are able to contain null values using \"arrayList.add(null)\": ");
        System.out.println(arrayList);
        System.out.println("--------------------------------- ");

        //removes null
        arrayList.remove(null);

        System.out.println("Here we can remove any null value from the Array List using \"arrayList.remove(null)\": ");
        System.out.println(arrayList);
        System.out.println("---------------------------------");

        //removes the value if it fits an expression
        // if the n is exaclty divisible by three it will be removed
        arrayList.removeIf( n -> (n%3 == 0) );
        System.out.println("Here we remove any number that is exactly divisible by 3 using \"removeIf\": ");
        System.out.println(arrayList);
    }


}
