package cha06;

import java.util.function.IntBinaryOperator;

public class List6_2 {
    public static int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        IntBinaryOperator func = List6_2::sub;

        int a = func.applyAsInt(5, 3);
        System.out.println(a);
    }
}
