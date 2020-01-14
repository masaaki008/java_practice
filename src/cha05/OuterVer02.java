package cha05;

public class OuterVer02 {
    int outerMember;

    void outerMethod() {
        int a = 10;
        class Inner {
            public void innerMethod() {
                System.out.println("InnerMethodです");
                System.out.println(outerMember);
            }
        }
        Inner ic = new Inner();
        ic.innerMethod();
    }
}
