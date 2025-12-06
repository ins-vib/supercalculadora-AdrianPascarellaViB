package org.yourcompany.calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testNombreDigits() {
        assertEquals(1, Calculadora.nombreDigits(0));
        assertEquals(4, Calculadora.nombreDigits(1234));
        assertEquals(6, Calculadora.nombreDigits(-101010));
    }

    @Test
    public void testSumaPrimersNumeros() {
        assertEquals(-15, Calculadora.sumaPrimersNumeros(-5));
        assertEquals(55, Calculadora.sumaPrimersNumeros(10));
        assertEquals(0, Calculadora.sumaPrimersNumeros(0));
    }

    @Test
    public void testCalcularFactorial() {
        assertEquals(120, Calculadora.calcularFactorial(5));
        assertEquals(-5040, Calculadora.calcularFactorial(-7));
        assertEquals(1, Calculadora.calcularFactorial(1));
    }

    @Test
    public void testSumaQuadrats() {
        assertEquals(14, Calculadora.sumaQuadrats(3));
        assertEquals(14, Calculadora.sumaQuadrats(-3));
        assertEquals(0, Calculadora.sumaQuadrats(0));
    }

    @Test
    public void testCalcularPotencia() {
        assertEquals(1, Calculadora.calcularPotencia(2, 0));
        assertEquals(2, Calculadora.calcularPotencia(2, 1));
        assertEquals(8, Calculadora.calcularPotencia(2, 3));
        assertEquals(0, Calculadora.calcularPotencia(0, 5));
        assertEquals(1, Calculadora.calcularPotencia(0, 0));
    }

}
