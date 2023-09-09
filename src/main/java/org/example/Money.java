package org.example;

public class Money {

    private long left;
    private byte right;

    public Money() {
        this.left = 0;
        this.right= 0;
    }
    public Money(long left, byte right) {
        if (right > 99) {
            long whole = 0;
            whole = right / 100;
            this.left = left + whole;
            this.right = (byte)(right % 100);
        } else {
            this.left = left;
            this.right = right;
        }
    }

    public long getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public byte getRight() {
        return right;
    }

    public void setRight(byte right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return String.format("%d руб. %02d коп.", this.left, this.right);
    }

    public Money plus(Money money) {
        Money res = new Money();
        res.left = this.left + money.left;
        int rightTmp = this.right + money.right;
        if (rightTmp > 99) {
            res.left += rightTmp / 100;
            res.right = (byte)(rightTmp % 100);
        } else {
            res.right = (byte)rightTmp;
        }
        return res;
    }

    public Money minus(Money money) {
        Money res = new Money();
        long tmp1 = this.left * 100 + this.right;
        long tmp2 = money.left * 100 + money.right;
        long tmp3 = tmp1 - tmp2;
        res.left = tmp3 / 100;
        res.right = (byte)(tmp3 % 100);
        return res;
    }

    public Money division(double a) {
        Money res = new Money();
        double tmp1 = (this.left * 100 + this.right) / a;
        res.left = (long) (tmp1 / 100);
        res.right = (byte)(tmp1 % 100);
        return res;
    }

    public double division(Money money) {
        Money res = new Money();
        long tmp1 = this.left * 100 + this.right;
        long tmp2 = money.left * 100 + money.right;
        double tmp3 = (double)tmp1 / (double)tmp2;
        return tmp3;
    }

}
