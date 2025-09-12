package reviewall.method;

public class overloadingEx3 {
    public static void main(String[] args) {
        int balance = 10000;

        //입금 1000
        balance = inmoney(balance, 1000);

        //출금 2000
        balance = outmoney(balance, 2000);

        balance = outmoney(balance, 30000);

        System.out.println("최종 잔액: " + balance + "원");
    }

    private static int outmoney(int balance, int money) {
        System.out.println("현재 잔고: " + balance);
        System.out.println(money + "원을  출금합니다");
        if (balance < money) {
            System.out.println("계좌의 금액이 부족합니다.");
            System.out.println("계좌의 금액이 부족합니다.");
            System.out.println("계좌의 금액이 부족합니다.");
            System.out.println("계좌의 금액이 부족합니다.");
            System.out.println("계좌의 금액이 부족합니다.");
            System.out.println("계좌의 금액이 부족합니다.");
        } else {
            balance -= money;
            System.out.println(money + "원 출금완료, 현재 잔고 :" + balance);
            return balance;
        }
        return balance;
    }

    private static int inmoney(int balance, int money) {
        System.out.println(money + "원을 입금합니다.");
        balance += money;
        System.out.println(money + "원 입금완료, 현재 잔고 :" + balance);
        return balance;
    }
}