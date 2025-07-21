package 그것만이내세상;

import java.sql.SQLOutput;
import java.util.Scanner;

public class 스캐너4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int num1 = scanner.nextInt();
        int num2 = 1;

        System.out.println(num1 + "단의 구구단 : ");
        while (num2 < 10) {
            System.out.println(num1 + "x" + num2 + " = " + (num1*num2));
            num2++;
        }
    }
}
