package 세번째;

import java.util.Scanner;

public class 문제와풀이4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("보고싶은 구구단수를 입력하십시오(9 이하) :");
        int num = scanner.nextInt();

        if (num < 10 && num >= 0) {
            System.out.println(num + "단의 구구단");
            int num2 = 1;
            while (num2 < 10) {
                System.out.println(num + " x " + num2 + " = " + num * num2);
                num2++;
            }
        } else {
            System.out.println("잘못된 숫자입니다.");
        }
    }
}
