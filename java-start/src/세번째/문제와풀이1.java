package 세번째;

import java.util.Scanner;

public class 문제와풀이1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름은? :");
        String name = scanner.nextLine();

        System.out.print("당신의 나이는? :");
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + " 입니다");
    }
}
