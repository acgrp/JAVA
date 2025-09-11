package reviewall.Scanner;

import java.util.Scanner;

public class ScannerEX4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("확인할 숫자를 입력해주세요 : ");
        int name = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(name + " X " + i + " = " + (name * i));
        }

    }
}
