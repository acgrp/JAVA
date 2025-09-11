package reviewall.Scanner;

import java.util.Scanner;

public class ScannerEX3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = 0;
        System.out.print("음식 이름을 입력해주세요 : ");
        String name = sc.nextLine();

        if (name.equals("피자")){
            cost = 20000;
            System.out.print("음식의 갯수를 입력해주세요 : ");
            int count = sc.nextInt();
            System.out.println("주문하신 메뉴는 :" + name + " " + count + "개");
            System.out.println("결제하실 금액은 : " + cost*count + " 입니다");
        } else if (name.equals("치킨")) {
            cost = 16000;
            System.out.print("음식의 갯수를 입력해주세요 : ");
            int count = sc.nextInt();
            System.out.println("주문하신 메뉴는 :" + name + " " + count + "개");
            System.out.println("결제하실 금액은 : " + cost*count + " 입니다");
        } else {
            System.out.println("잘못된 메뉴입니다");
        }
    }
}
