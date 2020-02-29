package cha19;

class CountUpThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }
}

public class Pra19_1 {
    public static void main(String[] args) {
        new CountUpThread().start();
        new CountUpThread().start();
        new CountUpThread().start();
    }
}
