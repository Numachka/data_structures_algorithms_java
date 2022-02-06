package com.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Testing the Luhn number validation algorithm.")
class LuhnValidationTest {

    private LuhnValidation instance;

    @BeforeEach
    void setUp() {
        instance = new LuhnValidation();
    }

    @Test
    @DisplayName("Empty String")
    public void testLuhnValidationWithEmptyString(){
        assertEquals(false, instance.validateLuhn(""));
    }

    @Test
    @DisplayName("String over 16 chats long.")
    public void testLuhnValidationWithTooLongString(){
        assertEquals(false, instance.validateLuhn("12345678910111213141516"));
    }

    @Test
    @DisplayName("Correctly formatted odd string.")
    public void testLuhnValidationOdd(){
        assertEquals(true, instance.validateLuhn("320614654"));
    }

    @Test
    @DisplayName("Correctly formatted even string.")
    public void testLuhnValidationEven(){
        assertEquals(false, instance.validateLuhn("33061465"));
    }
}