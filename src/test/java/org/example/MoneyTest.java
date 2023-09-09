package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MoneyTest {
    Money money = new Money((long)11, (byte)120);
    Money money2 = new Money((long)4, (byte)90);

    @Test
    void testToString() {
        assertEquals("12 руб. 20 коп.", money.toString());
    }

    @Test
    void plus() {
        assertEquals("17 руб. 10 коп.", money.plus(money2).toString());
    }

    @Test
    void minus() {
        assertEquals("7 руб. 30 коп.", money.minus(money2).toString());
    }

    @Test
    void division() {
        assertEquals("6 руб. 10 коп.", money.division(2).toString());
        assertEquals(2.489795918367347, money.division(money2));
    }

}