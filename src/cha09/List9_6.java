package cha09;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class List9_6 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        baos.write(65);
        baos.write(66);

        byte[] data = baos.toByteArray();

        System.out.println(Arrays.toString(data));
    }
}
