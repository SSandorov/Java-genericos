package com.mycompany.app;

//* Asi es como definimos una clase generica
//* Se emplea la T de Type por convencion
public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box [value=" + value + "]";
    }

}

