package com.certidevs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
*  Testing Unitario con junit 5
* */

public class VariablesTest {

    @Test
    void hola() {
        String respuesta = HolaMundo.hola();
        assertEquals("Hola", respuesta);
    }

    @Test
    void tiposNumerosEnteros() {
        byte numero1 = 5;
        short numero2 = 10;
        int numero3 = 20;
        long numero4 = 500;
        assertEquals(50, numero1);
    }

    @Test
    void tiposNumerosDecimales(){
        float numero1 = 50.10f;
        double numero2 = 500.1111;
        assertEquals(50.10f, numero1);
    }

    @Test
    void tiposTexto() {
        String textoCorto = "Texto String para describir algo";

        String textoLargo = """
                Este es un texto de varias lineas
                Otra linea
                Y otra linea
                """;
        char grupo = 'A';
    }

}