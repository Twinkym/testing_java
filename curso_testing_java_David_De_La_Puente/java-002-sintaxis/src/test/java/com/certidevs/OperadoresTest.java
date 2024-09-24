package com.certidevs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperadoresTest {

    @Test
    void operadoresAritmeticos_suma() {
        int suma = 5 + 5;
        int suma2 = suma + suma;
        int suma3 = suma2 + 10;
        assertEquals(60, suma3);
    }

    @Test
    void operadoresAritmeticos_resta() {
        int resta = 10 -6;
        assertEquals(4, resta);
    }

    @Test
    void operadoresAritmericos_multiplicacion(){
        int multiplicacion = 10 * 10;
        assertEquals(100, multiplicacion);
    }

    @Test
    void operadoresAritmericos_division(){
        int resultado1 = 10 / 5;
        int resultado2 = 5 / 3;
        float resultado3 = 5f/ 3;
    }
}
