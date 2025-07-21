package 그것만이내세상;

import java.util.Scanner;

public class 스캐너3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요.: ");
        String manu = scanner.nextLine();

        System.out.print("음식 가격을 입력해주세요.: ");
        int price = scanner.nextInt();

        System.out.print("음식 갯수를 입력해주세요.: ");
        int count = scanner.nextInt();

        System.out.println(manu + count + " 개를 주문하셨습니다.  총 가격은 " + (price*count) + "원 입니다.");
    }
}
