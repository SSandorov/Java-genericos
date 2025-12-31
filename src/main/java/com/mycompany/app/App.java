package com.mycompany.app;

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
        Box<String> stringBox = new Box("Gabriel");
        System.out.println(stringBox);
        Box<Integer> intBox = new Box(10);
        System.out.println(intBox);

        Utility.printItem("Fernando");
        Utility.printItem(20);

        Utility.printItem("Paco", 50);

        MathUtils.sum(2, 10);
        //* Solo permite numeros
        // MathUtils.sum(2, "Hola");
    }
}
