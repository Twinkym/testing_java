package com.certidevs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.assertions.*;

class HolaMundoTest {
    @Test
    void hola() {
        String respuesta = HolaMundo.hola();
        assertEquals("Hola", respuesta);
    }
}