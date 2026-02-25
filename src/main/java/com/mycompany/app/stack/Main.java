package com.mycompany.app.stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);

        Stack<String> stringStack = new Stack<>();

        stringStack.push("Gabriel");
        stringStack.push("Fernando");

        integerStack.print();
        stringStack.print();

        System.out.println("Elemento en la cima " + integerStack.peek());
    }
}
