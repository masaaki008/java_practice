package cha04;

import java.util.ArrayList;
import java.util.List;

class Hero {
    public String name;
}

public class List4_3 {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>();

        Hero h1 = new Hero();

        h1.name = "ミナト";
        list.add(h1);
        System.out.println("要素数=" + list.size());
        System.out.println(h1);
        h1 = new Hero();
        h1.name = "ミナト";
        list.remove(h1);
        System.out.println("要素数=" + list.size());
        System.out.println(h1);
    }
}
