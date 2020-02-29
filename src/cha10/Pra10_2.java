package cha10;

import java.io.*;

public class Pra10_2 {
    public static void main(String[] args) throws Exception {

        Employee t = new Employee("田中太郎", 41);
        Department s = new Department("総務部", t);

        FileOutputStream fos = new FileOutputStream("company.dat");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s);

        oos.flush();

        oos.close();

        FileInputStream fis = new FileInputStream("company.dat");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Department d = (Department) ois.readObject();

        System.out.println(d.toString());

        ois.close();
    }
}

class Employee implements Serializable {

    private static final long serialVersionUID = -8101982245867296674L;

    String name;
    int age;

    Employee(String n, int a) {
        this.name = n;
        this.age = a;
    }
}

class Department implements Serializable {

    private static final long serialVersionUID = -179373815779172776L;

    String name;
    Employee leader;

    Department(String n, Employee l) {
        this.name = n;
        this.leader = l;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.leader.name + ":" + this.leader.age;
    }
}
