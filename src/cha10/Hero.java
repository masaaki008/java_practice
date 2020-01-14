package cha10;

import java.io.Serializable;

public class Hero implements Serializable {

    private static final long serialVersionUID = 6854815491653713570L;

    private String name;
    private int hp;
    private int mp;

    Hero(String n, int h, int m) {
        this.name = n;
        this.hp = h;
        this.mp = m;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.hp + ":" + this.mp;
    }
}
