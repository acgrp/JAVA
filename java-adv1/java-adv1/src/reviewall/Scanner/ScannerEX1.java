package reviewall.Scanner;

import java.util.Scanner;

public class ScannerEX1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("당신의 나이를 입력하세요 : ");
        String old = sc.nextLine();


        System.out.println("당신은 " + name + "나이는 " + old);
    }
}
