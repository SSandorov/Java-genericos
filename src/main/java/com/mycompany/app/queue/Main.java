package com.mycompany.app.queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> numbers = new Queue<>();

        numbers.enqueue(10);
        numbers.enqueue(20);
        numbers.enqueue(30);

        numbers.dequeue();

        numbers.print();
    }
}
