package cha05;

public class PocketVer01Test {
    public static void main(String[] args) {
        PocketVer01 p = new PocketVer01();
        p.put("1192");
        String s = (String) p.get();
        System.out.println(s);
    }
}
