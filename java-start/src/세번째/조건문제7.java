package 세번째;

import java.util.Scanner;

public class 조건문제7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 적어주세요.:");
        int A = scanner.nextInt();

        String result = (A % 2 == 0) ? "짝수" : "홀수";
        System.out.println("A = " + A + ", " + result);
    }
}
