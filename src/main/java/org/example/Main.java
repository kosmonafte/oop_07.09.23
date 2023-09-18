package org.example;

import org.example.library.Library;
import org.example.library.LibraryLife;

public class Main {
    public static void main(String[] args) {
//        RangeProgram rng = new RangeProgram();
//        rng.start();

//        Money money = new Money((long)11, (byte)120);
//        Money money2 = new Money((long)4, (byte)90);
//        System.out.println(money.toString());
//        System.out.println(money.division(money2));

        LibraryLife lb = new LibraryLife();
        lb.start();

    }
}