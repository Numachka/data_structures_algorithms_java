package com.questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleOf3Or5Test {

    private MultipleOf3Or5 multipleOf3Or5;

    @BeforeEach
    void setUp() {
        multipleOf3Or5 = new MultipleOf3Or5();
    }

    @Test
    void multipleOfThreeOrFiveTest() {
        Assertions.assertEquals(23, multipleOf3Or5.multipleOfThreeOrFive(10));
    }
}