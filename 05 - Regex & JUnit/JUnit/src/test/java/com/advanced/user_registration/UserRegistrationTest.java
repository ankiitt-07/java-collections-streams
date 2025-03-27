package com.advanced.user_registration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    void testValidRegister() {
        Assertions.assertTrue(UserRegistration.registerUser("anmol", "test@test.com", "9AuraKng"));
    }

    @Test
    void testInvalidRegister() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("anLe", "test@test", "9AuraKng"));
    }
}
