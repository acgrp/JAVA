package reviewall.Scanner;

import java.util.Scanner;

public class ScannerEX2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();


        if (num%2 == 0) {
            System.out.println("당신은 숫자는 짝수");
        } else {
            System.out.println("당신은 숫자는 홀수");
        }
    }
}
