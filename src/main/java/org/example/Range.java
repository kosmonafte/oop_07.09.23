package org.example;

public class Range {
    private int a;
    private int b;
    public Range() {
        this.a = 0;
        this.b = 1;
    }
    public Range(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int showRange() {
        return this.b - this.a;
    }

    public boolean checkIntersectionRange(Range range) {
        boolean res;
        if (range.a >= this.a && range.a <= this.b || range.b >= this.a && range.b <= this.b) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
