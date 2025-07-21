package 세번째;

import java.util.Scanner;

public class 문제와풀이3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("읍식 이름을 입력해주세요 :");
        String name = scanner.nextLine();

        System.out.print("음식 가격을 입력해주세요 :");
        int price = scanner.nextInt();

        System.out.print("음식 수량을 입력해주세요 :");
        int count = scanner.nextInt();

        System.out.println(name + " 을 " + count + "개 주문하셨습니다. 총 가격은 " + price*count + "입니다.");
    }
}
