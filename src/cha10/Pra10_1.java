package cha10;

import java.io.*;
import java.util.Properties;

public class Pra10_1 {
    public static void main(String[] args) throws IOException {
        Reader r = new FileReader("pref.properties");

        Properties p = new Properties();

        p.load(r);

        String capital = p.getProperty("aichi.capital");
        String food = p.getProperty("aichi.food");

        System.out.println(capital + ":" + food);

        r.close();
    }
}
