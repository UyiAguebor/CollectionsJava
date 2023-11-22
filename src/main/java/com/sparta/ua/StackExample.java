package com.sparta.ua;


import java.util.Stack;


public class StackExample {
    public static void main(String[] args) {

        //First in last out data structure
        //
        Stack<String> stack1 =  new Stack<>();


        //pushing numbers onto the stack "The cat is big."
        stack1.push("The");
        stack1.push("cat");
        stack1.push("is");
        stack1.push("big");
        stack1.push(".");

        //prints out the stack
        System.out.println("This is the initial stack:");
        System.out.println(stack1);

        //pops out the last two values . big
        stack1.pop();
        stack1.pop();

        //pushes "small" and "."
        System.out.println("---------------------------------");
        stack1.push("small");
        stack1.push(".");

        System.out.println("Here we changed big to small using \"stack1.push()\":");
        System.out.println("\"" + stack1 + "\"");
        System.out.println("---------------------------------");

        System.out.println("Here we focus on printing the last value pushed to the stack using \"stack1.peek()\":");
        System.out.println(stack1.peek());
        System.out.println("---------------------------------");


        //list interface also implements clear
        stack1.clear();
        System.out.println("After we cleared the stack here is the what it contains using \"stack1.clear()\": ");
        System.out.println(stack1);
        System.out.println("---------------------------------");

        System.out.println("If the stack empty it returns a boolean using \"stack1.isEmpty()\": ");
        System.out.println(stack1.isEmpty());

    }
}
