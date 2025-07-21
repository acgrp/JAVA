package 세번째;

import java.util.Scanner;

public class 문제와풀이6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("당신의 이름은? (종료를 입력하면 종료):");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("당신의 나이는? :");
            int age = input.nextInt();
            input.nextLine();

            System.out.println(" 당신의 이름은 " + name + " 나이는 " + age + " 입니다 ");

        }
    }
}
