package org.example;
import java.util.Scanner;
public class RangeProgram {
    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задание 1: Вывести длину диапазонов.\nВведите диапазоны через запятую, значения диапозонов разделять пробелом\nПример: 1 2, 4 9, 5 1, 3 7");
        String str = scan.nextLine();
        Range[] ranges = RangeFactory.getRangeArray(str);
        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i].getA() ==  ranges[i].getB()) {
                System.out.println("Диапазон задан неверно!");
            } else {
                System.out.println(ranges[i].showRange());
            }
        }
        System.out.println();
        System.out.println("Задание 2: Проверка пересекаются ли диапазоны.\nВведите 2 диапазона:");
        str = scan.nextLine();
        Range[] rng = RangeFactory.getRangeArray(str);
        if (rng[0].checkIntersectionRange(rng[1])) {
            System.out.println("Диапазоны пересекаются");
        } else {
            System.out.println("Диапазоны не пересекаются");
        }
    }
}
