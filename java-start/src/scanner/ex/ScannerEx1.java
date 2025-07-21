package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름은? : ");
        String name = scanner.nextLine();// 이름을 받는다.

        System.out.print("당신의 나이는? : ");
        int age = scanner.nextInt();// 나이을 받는다.

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age +"입니다.");
    }
}
