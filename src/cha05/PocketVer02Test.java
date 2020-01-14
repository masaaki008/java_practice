package cha05;

public class PocketVer02Test {
    public static void main(String[] args) {

        PocketVer02<String> p = new PocketVer02<>();

        p.put("1192");

        String s = p.get();
        System.out.println(s);
    }
}
