package 그것만이내세상;

import java.util.Scanner;

public class 스캐너8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCost = 0;
        while (true) {
            System.out.print("1: 상품 입력, 2: 결제, 3: 프로그램 종료: ");
            int num = sc.nextInt();

                if (num == 1) {

                System.out.print("상품명을 입력하세요: ");
                String name = sc.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = sc.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int count = sc.nextInt();

                totalCost += price * count;
                System.out.println("상품명: " + name +  ", 가격: " + price + ", 수량: " + count + ", 합계: " + totalCost);
                } else if (num == 2) {
                System.out.println("총비용: " + totalCost);
                 totalCost = 0;
                } else if (num == 3) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            }

        }

    }