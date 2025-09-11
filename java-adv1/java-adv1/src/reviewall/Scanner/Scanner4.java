package reviewall.Scanner;

import java.util.Scanner;

public class Scanner4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력 : ");
            String s = sc.nextLine();
            if (s.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            System.out.println("입력한 문자열 : " + s);
        }
    }
}
