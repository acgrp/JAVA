package 그것만이내세상;

import java.util.Scanner;

public class 탬프2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int a = scanner.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int b = scanner.nextInt();

        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("두 숫자 사이의 모든 정수: ");
        while (a <= b) {
            System.out.print(a);
            if (a < b) {
                System.out.print(", ");
            }
            a++;
        }
    }
}
