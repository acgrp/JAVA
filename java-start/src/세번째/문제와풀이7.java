package 세번째;

import java.util.Scanner;

public class 문제와풀이7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("상품가격을 입력하세요 (-1을 입력하면 종료):");
            int cost = input.nextInt();

            if (cost == (-1)) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("상품의 갯수는? :");
            int num = input.nextInt();
            input.nextLine();

            System.out.println(" 총 비용 " + cost * num + "원 입니다");

        }
    }
}
