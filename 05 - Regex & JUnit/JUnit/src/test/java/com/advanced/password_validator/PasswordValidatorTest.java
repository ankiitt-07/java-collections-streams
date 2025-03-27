package com.advanced.password_validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PasswordValidatorTest {
    @ParameterizedTest
    @ValueSource(strings = {"Ajsjs92dd", "2ofos9!AA"})
    void validateValidPassword (String password) {
        Assertions.assertTrue(PasswordValidator.validate(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"jsjs92dd", "ofos!AA", "w29A"})
    void validateNonValidPassword (String password) {
        Assertions.assertFalse(PasswordValidator.validate(password));
    }
}
