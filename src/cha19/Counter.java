package cha19;

public class Counter {
    private long count = 0;
    public void add(long i) {
        System.out.println("足し算します");

        synchronized (this) {
            this.count += 1;
        }
    }

    public void mul(long i) {
        System.out.println("掛け算します");

        synchronized (this) {
            this.count *= i;
        }
    }
}
