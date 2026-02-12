package com.ExceptionTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AgeValidatorTest {

    @Test
    void testInvalidAge() {
        assertThrows(IllegalArgumentException.class, () -> {
            AgeValidator.validateAge(-1);
        });
    }
}
