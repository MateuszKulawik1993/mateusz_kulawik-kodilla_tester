package com.kodilla.jacoco.spotbugs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadCodeExampleTest {
    @Test
    void testGetPi() {
        assertEquals(Math.PI, BadCodeExample.getPi(), 0.0001);
    }

    @Test
    void testSetAndGetType() {
        BadCodeExample example = new BadCodeExample();
        example.setType("testType");
        assertEquals("testType", example.getType());
    }

    @Test
    void testEqualsAndHashCode() {
        BadCodeExample example1 = new BadCodeExample();
        example1.setType("type1");

        BadCodeExample example2 = new BadCodeExample();
        example2.setType("type1");

        assertEquals(example1, example2);
        assertEquals(example1.hashCode(), example2.hashCode());

        example2.setType("type2");
        assertNotEquals(example1, example2);
        assertNotEquals(example1.hashCode(), example2.hashCode());
    }

    @Test
    void testEqualsWithNullAndDifferentClass() {
        BadCodeExample example = new BadCodeExample();
        example.setType("type");

        assertNotEquals(example, null);
        assertNotEquals(example, new Object());
    }

}