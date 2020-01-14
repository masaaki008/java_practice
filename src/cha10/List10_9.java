package cha10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class List10_9 {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("ミナト", 75, 18);

        FileOutputStream fos = new FileOutputStream("rpgsave2.dat");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(hero1);

        oos.flush();

        oos.close();

        FileInputStream fis = new FileInputStream("rpgsave2.dat");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Hero hero2 = (Hero) ois.readObject();

        System.out.println(hero2.toString());

        ois.close();
    }
}
