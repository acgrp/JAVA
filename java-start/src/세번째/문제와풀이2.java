package 세번째;

import java.util.Scanner;

public class 문제와풀이2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 하나를 입력하세요 :");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력하신 정수" + num + " (은)는 짝수입니다.");
        } else {
            System.out.println("입력하신 정수" + num + " (은)는홀수입니다.");
        }
    }
}
