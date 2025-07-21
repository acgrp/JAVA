package 세번째;

import java.util.Scanner;

public class 조건문제3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 적어주세요(달러)");

        int dollar = scanner.nextInt();

        if (dollar > 0) {
            System.out.println("환전금액은 " + (dollar * 1300) + "입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        }
    }
}
