package cha14;

public class List14_5 {
    public static void main(String[] args) {
        System.out.println("アサーションにわざと失敗します");
        assert 1 == 0;
        System.out.println("正常終了します");
    }
}
