package cha03;

import java.util.ArrayList;

public class List3_1 {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<>();
        points.add(10);
        points.add(80);
        points.add(75);
        for (int i : points) {
            System.out.println(i);
        }
    }
}
