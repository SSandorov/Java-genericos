package com.mycompany.app;

//* Tambien podemos crear metodos genericos dentro de una clase tipada
public class Utility {
    //* Debido a que nuestra clase no es generica, debemos especificar
    //* el tipo de dato generico en nuestro metodo
    public static <T> void printItem(T value) {
        System.out.println(value);
    }

    //* Podemos pasar multiples tipos de datos genericos
    public static <T, K> void printItem(T value, K key) {
        System.out.println(value + " " + key);
    }
}
