package cha14;

public class AccountTest {
    public static void main(String[] args) {
        testInstantiate();
    }

    private static void testInstantiate() {
        System.out.println("無事newができるかテストします");

        Account a = new Account("ミナト", 30000);

        if (!"ミナト".equals(a.owner)) {
            System.out.println("失敗!名義人がおかしい");
        }

        if (30000 != a.balance) {
            System.out.println("失敗!残高がおかしい");
        }

        System.out.println("テストを終了します");
    }
}
