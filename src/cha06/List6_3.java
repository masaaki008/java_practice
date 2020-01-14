package cha06;

public class List6_3 {
    public static int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        MyFunction func = List6_3::sub;
        int a = func.call(5, 3);
        System.out.println(a);
    }
}
