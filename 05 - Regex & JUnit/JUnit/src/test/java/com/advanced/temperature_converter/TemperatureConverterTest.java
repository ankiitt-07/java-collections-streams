package com.advanced.temperature_converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.advanced.temperature_converter.TemperatureConverter.*;

public class TemperatureConverterTest {
    @Test
    void testFahrenheitToCelsius() {
        Assertions.assertEquals(0, fahrenheitToCelsius(32));
    }

    @Test
    void testCelsiusToFahrenheit() {
        Assertions.assertEquals(32, celsiusToFahrenheit(0));
    }

}
