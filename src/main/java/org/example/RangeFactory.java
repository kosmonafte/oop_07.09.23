package org.example;

public class RangeFactory {
    public static Range getRange(int a, int b) {
        Range range;
        if (a >= b) {
            range = new Range(0,0);
        } else {
            range = new Range(a,b);
        }
        return range;
    }

    public static Range[] getRangeArray(String str) {
        String[] strArr = str.split(",");
        Range[] ranges = new Range[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String[] valuesS = strArr[i].trim().split(" ");
            ranges[i] = RangeFactory.getRange(Integer.parseInt(valuesS[0]), Integer.parseInt(valuesS[1]));
        }
        return ranges;
    }
}
