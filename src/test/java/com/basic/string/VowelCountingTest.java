package com.basic.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelCountingTest {

    private VowelCounting vowelCounting;

    @BeforeEach
    void setUp() {
        vowelCounting = new VowelCounting();
    }

    @Test
    void getCountTest() {
        Assertions.assertEquals(5, vowelCounting.getCount("abracadabra"));
        Assertions.assertEquals(4, vowelCounting.getCount("abababa"));
        Assertions.assertEquals(7, vowelCounting.getCount("dsaduoioabra"));
        Assertions.assertEquals(1, vowelCounting.getCount("brar"));
    }
}