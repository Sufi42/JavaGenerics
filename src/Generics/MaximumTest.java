package Generics;

import java.sql.SQLOutput;

public class MaximumTest<T extends Comparable<T>> {
    T x, y, z;

    public MaximumTest(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;

        }
        PrintMax(x, y, z, max);
        return max;
    }

    public static <T> void PrintMax(T x, T y, T z, T max) {
        System.out.println(x + " " + y + " " + z + " : Maximum among x and y and z is : " + max);
    }

    public static <T extends Comparable<T>> T maxStr(T s, T t, T r) {
        T max = s;
        if (t.compareTo(max) > 0) {
            t = max;
        }
        if (r.compareTo(max) > 0) {
            r = max;
        }
        PrintMax(s, t, r, max);
        return max;

    }

    public static void main(String[] args) {
        Integer xint = 1, yint = 2, zint = 3;
        String sStr = "abc", tStr = "xyz", rStr = "ghj";
        MaximumTest.maximum(sStr, tStr, rStr);
        MaximumTest.maximum(xint, yint, zint);
    }
}
