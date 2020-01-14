package cha06;

interface Func1 {
    boolean call(int x);
}

interface Func2 {
    String call(boolean male, String name);
}

public class Pra6_1 {
    public static void main(String[] args) {
        FuncList funcList = new FuncList();
        Func1 f1 = FuncList::isOdd;
        Func2 f2 = funcList::addNamePrefix;
        System.out.println(f1.call(15));
        System.out.println(f2.call(true, "Smith"));

        // ラムダ式 =============================================
        Func1 F1 = x -> x % 2 == 1;
        Func2 F2 = (male, name) -> {
            if (male) {
                return "Mr." + name;
            } else {
                return "Ms." + name;
            }
        };
    }
}
