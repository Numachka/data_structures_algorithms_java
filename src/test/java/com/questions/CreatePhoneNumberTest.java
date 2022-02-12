package com.questions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatePhoneNumberTest {

    private CreatePhoneNumber instance;

    @BeforeEach
    void setUp() {
        instance = new CreatePhoneNumber();
    }

    @Test
    public void testPhoneNumber() {
        assertEquals("(123) 456-7890", instance.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}