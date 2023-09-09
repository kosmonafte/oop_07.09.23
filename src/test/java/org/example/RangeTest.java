package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeTest {
    Range range = new Range(2, 7);
    Range range2 = new Range(3, 9);
    @Test
    void showRange() {
        assertEquals(5, range.showRange());
    }

    @Test
    void checkIntersectionRange() {
        assertEquals(true, range.checkIntersectionRange(range2));
    }
}