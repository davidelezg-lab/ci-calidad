package com.ejemplo;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }
    public int metodoConMalaCalidad(int numero) {
    int resultado = 0;

    if (numero > 0) {
        if (numero > 10) {
            if (numero > 100) {
                resultado = numero * 2;
            } else {
                resultado = numero + 10;
            }
        } else {
            resultado = numero + 1;
        }
    } else {
        resultado = -1;
    }

    return resultado;
}
}
