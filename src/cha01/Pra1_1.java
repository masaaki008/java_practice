package cha01;

import java.util.Arrays;

public class Pra1_1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            s.append(i).append(",");
        }

        String ss = s.toString();
        String[] a = ss.split(",");

        System.out.println(s);
        System.out.println(Arrays.toString(a));
    }
}
