package com.basic.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringManipulationTest {

    private StringManipulation stringManipulation;

    @BeforeEach
    void setUp() {
        stringManipulation = new StringManipulation();
    }

    @Test
    public void disemvowelTest() {
        Assertions.assertAll(() -> {
            Assertions.assertEquals(
                    "Ths wbst s fr lsrs LL!",
                    stringManipulation.disemvowelV2("This website is for losers LOL!"));
            Assertions.assertEquals(
                    "N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
                    stringManipulation.disemvowelV2("No offense but,\nYour writing is among the worst I've ever read"));
            Assertions.assertEquals(
                    "Wht r y,  cmmnst?",
                    stringManipulation.disemvowelV2("What are you, a communist?"));
        });
    }

    @Test
    void camelCaseTest() {
        Assertions.assertEquals( "camel Casing", stringManipulation.camelCase("camelCasing"));
        Assertions.assertEquals( "camel Casing Test", stringManipulation.camelCase("camelCasingTest"));
        Assertions.assertEquals( "camelcasingtest", stringManipulation.camelCase("camelcasingtest"));
        Assertions.assertEquals( "", stringManipulation.camelCase(""));
    }
}