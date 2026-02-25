package com.mycompany.app.queue;

//* Los queue o filas son estructuras de datos que siguen el principio de First In,

import java.util.LinkedList;
import java.util.NoSuchElementException;

//* First Out (FiFo)
public class Queue<T> {
    private final LinkedList<T> elements = new LinkedList<>();

    public void enqueue(T element) {
        elements.addLast(element);
        System.out.println("Elemento agregado " + element);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La fila esta vacia");
        }

        return elements.getFirst();
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("La fila esta vacia");
        }

        return elements.removeFirst();
    }

    public void print() {
        for (Object o: elements) {
            System.out.println(o);
        }
    }


}
