package cha09;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class List9_5 {
    public static void main(String[] args) throws IOException {
        String msg = "第1土曜";

        Reader sr = new StringReader(msg);
        char c1 = (char) sr.read();
        char c2 = (char) sr.read();
        char c3 = (char) sr.read();
        char c4 = (char) sr.read();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
