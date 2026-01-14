package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //* La clase Object es la superclase de todas las clases en Java
        //* Por lo tanto:
        //*     - Herencia universal: Todas las clases en Java heredan de Object
        //*     - Polimorfismo: La clase object permite almacenar cualquier tipo de dato
        //*     - Metodos basicos: metodos como el toString(), equals(), hashCode() vienen
        //*     heredados de la clase Object

        //* La clase Objects, a diferencia de la clase Object es una clase utilitaria que
        //* contiene metodos estaticos para realizar operaciones segura con objetos

        //* Como vemos puede contener cualquier valor
        Object number = Integer.valueOf(10);
        number = "Hola!";
        System.out.println(number);

        //* No confundir con el var, ya que solo funciona con variables locales, no funciona ni con
        //* parametros, ni atributos de clases, ni retornos de metodos
        //* Una vez inferido un tipo de dato ya no puede cambiar
        var name = "Gabriel";
        //* no es posible
        // name = 10;

        //* Es importante saber que al principio se empleaba la clase Object para emplear genericos
        //* Fue a partir de la version 5 de Java que se implementaron los genericos en el lenguaje

        //* Al emplear la clase Object solo tenemos acceso a los metodos de ella, no a metodos
        //* especificos de los tipos de datos que estamos manejando, por lo que no es muy util

        //* Ejemplos con la clase generica Box
        Box<String> stringBox = new Box<>("Gabriel");
        System.out.println(stringBox);
        Box<Integer> intBox = new Box<>(10);
        System.out.println(intBox);

        Utility.printItem("Fernando");
        Utility.printItem(20);

        Utility.printItem("Paco", 50);

        MathUtils.sum(2, 10);
        //* Solo permite numeros
        // MathUtils.sum(2, "Hola");

        List<String> names = new ArrayList<>();
        names.add("Gabriel");
        names.add("Maria");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(2);

        //* A print list, con el wildcard, le podemos pasar colecciones listas de cualquier tipo
        printList(names);
        printList(numbers);

        //* A sumNumbers, con el wildcard restringido a los numeros, solo podemos pasarle numeros
        sumNumbers(numbers);

        //* Con el uso de la contra varianza super en lugar del extend, podemos modificar los valores
        //* Y asignando el tipo de dato Object tambien podemos leer los valores de la coleccion
        addNumbers(numbers);
    }

    //* Los wildcards nos permiten manejar de manera flexible listas de objetos genericos dentro
    //* de una jerarquia de herencia
    public static void printList(List<?> list) {
        for (Object o: list) {
            System.out.println(o);
        }
    }

    public static void sumNumbers(List<? extends Number> numbers) {
        double sum = 0;
        for (Number num: numbers) {
            sum += num.doubleValue();
        }
        System.out.println(sum);

        //* No podemos efectuar modificaciones con el uso del wildcard normal o restringido
        //* solo podemos hacer lecturas
        // numbers.add(4);

        //* Solo podemos anadir valores de tipo null
        // numbers.add(null);
    }

    public static void addNumbers(List<? super Integer> numbers) {
        //* Con el super podemos modificar, pero no leer de manera directa
        //* Para leer debemos emplear la super clase Object
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //* No podemos leer los valores de la coleccion con el tipo de dato concreto
        // Integer num = numbers.get(0);

        //* Pero si podemos leer con la clase Object
        Object num = numbers.get(0);
        System.out.println(num);
    }
}
