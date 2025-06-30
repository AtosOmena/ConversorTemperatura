
package com.gc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTemperaturaTest {

    @Test
    public void testFahrenheitToCelsius() {
        double result = ConversorTemperatura.fahrenheitToCelsius(212);
        assertEquals(100.0, result, 0.001);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        double result = ConversorTemperatura.celsiusToFahrenheit(0);
        assertEquals(32.0, result, 0.001);
    }
}
