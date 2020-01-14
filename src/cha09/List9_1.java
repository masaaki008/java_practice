package cha09;

import java.io.FileWriter;
import java.io.IOException;

public class List9_1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/masaaki/java_practice/rpgsave.dat", true);

        fw.write('A');
        fw.flush();
        fw.close();
    }
}
