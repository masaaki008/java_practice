package cha05;

public class PocketVer02<E> {
    private E data;

    public void put(E d) {
        this.data = d;
    }

    public E get() {
        return this.data;
    }
}
