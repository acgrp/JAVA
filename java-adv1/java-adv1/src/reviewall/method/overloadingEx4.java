package reviewall.method;

import java.util.Scanner;

public class overloadingEx4 {

    public static void main(String[] args) {
        int balance = 20000;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("--------------------------------------");
            System.out.print("선택 : ");
            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("입금 액을 입력하세요.");
                int inmoney = sc.nextInt();
                balance = inmoney(balance, inmoney);
            } else if (menu == 2) {
                System.out.println("출금 액을 입력하세요.");
                int outmoney = sc.nextInt();
                balance = outmoney(balance, outmoney);
            } else if (menu == 3) {
                System.out.println("현재 잔액" + balance + "원");
            } else if (menu == 4) {
                System.out.println("시스템을 종료합니다. >.<");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
    private static int inmoney(int balance, int money) {
        System.out.println(money + "원을 입금합니다.");
        balance += money;
        System.out.println(money + "원 입금완료, 현재 잔고 :" + balance);
        return balance;
    }
    private static int outmoney(int balance, int money) {
        System.out.println("현재 잔고: " + balance);
        System.out.println(money + "원을  출금합니다");
        if (balance < money) {
            System.out.println("[계좌의 금액이 부족합니다. o.o!]");
        } else {
            balance -= money;
            System.out.println(money + "원 출금완료, 현재 잔고 :" + balance);
            return balance;
        }
        return balance;
    }

}