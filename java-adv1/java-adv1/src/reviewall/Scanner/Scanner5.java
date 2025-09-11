package reviewall.Scanner;

import java.util.Scanner;

public class Scanner5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("0을 입력하면 종료됩니다");
        while (true) {
            System.out.print("첫번째 숫자를 입력 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 숫자를 입력 : ");
            int num2 = sc.nextInt();

            if (num1*num2 == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            System.out.println("입력한 숫자의 곱 : " + num1*num2);
        }
    }
}
