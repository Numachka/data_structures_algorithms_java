package com.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicativePersistenceTest {

    private MultiplicativePersistence instance;

    @BeforeEach
    void setUp() {
        instance = new MultiplicativePersistence();
    }

    @Test
    @DisplayName("Recursive solution.")
    void testRecursivePersistence() {
        assertEquals(4, instance.persistenceRecursive(39));
        assertEquals(2, instance.persistenceRecursive(999));
        assertEquals(4, instance.persistenceRecursive(4));
    }

    @Test
    @DisplayName("Iterative solution.")
    void testPersistence() {
        assertEquals(3, instance.persistence(39));
        assertEquals(4, instance.persistence(999));
        assertEquals(0, instance.persistence(4));
    }
}