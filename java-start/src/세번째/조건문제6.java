package 세번째;

import java.util.Scanner;

public class 조건문제6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 적어주세요.:");
        int A = scanner.nextInt();

        System.out.print("두번째 숫자를 적어주세요.:");
        int B = scanner.nextInt();

        int max = (A > B) ? A : B;
        System.out.println(max);
    }
}
