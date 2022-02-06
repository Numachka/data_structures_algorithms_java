package com.basic.math;

import org.junit.jupiter.api.*;


@DisplayName("Prime numbers question tests.")
class PrimeTest {
    private Prime prime;

    @Nested
    @DisplayName("Is a number prime?")
    class isNumberPrimeTest {
        @BeforeEach
        void setUp() {
            prime = new Prime();
        }

        @Test
        @DisplayName("Are these numbers prime or not?")
        public void testBasic() {
            Assertions.assertAll(() -> {
                Assertions.assertEquals(false, prime.isPrime(0));
                Assertions.assertEquals(false, prime.isPrime(1));
                Assertions.assertEquals(true, prime.isPrime(2));
                Assertions.assertEquals(true, prime.isPrime(73));
                Assertions.assertEquals(false, prime.isPrime(75));
                Assertions.assertEquals(false, prime.isPrime(-1));
                Assertions.assertEquals(true, prime.isPrime(3));
                Assertions.assertEquals(true, prime.isPrime(7));
                Assertions.assertEquals(true, prime.isPrime(41));
                Assertions.assertEquals(true, prime.isPrime(5099));
                Assertions.assertEquals(false, prime.isPrime(4));
                Assertions.assertEquals(false, prime.isPrime(6));
                Assertions.assertEquals(false, prime.isPrime(8));
                Assertions.assertEquals(false, prime.isPrime(9));
                Assertions.assertEquals(false, prime.isPrime(45));
                Assertions.assertEquals(false, prime.isPrime(-5));
                Assertions.assertEquals(false, prime.isPrime(-8));
                Assertions.assertEquals(false, prime.isPrime(-41));
            });
        }
    }
}