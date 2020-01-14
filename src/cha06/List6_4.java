package cha06;

import java.util.function.IntBinaryOperator;

public class List6_4 {
    public static void main(String[] args) {
        IntBinaryOperator func = (int a, int b) -> {
            return a - b;
        };

        int a = func.applyAsInt(5, 3);

        System.out.println(a);
    }
}
