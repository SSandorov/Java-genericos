package com.mycompany.app;

public class MathUtils {
    //* Tambien podemos crear datos genericos que restringen a un tipo de datos concreto
    //* Para ello se emplea la herencia
    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}
