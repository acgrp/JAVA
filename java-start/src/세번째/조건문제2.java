package 세번째;

import java.util.Scanner;

public class 조건문제2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이동거리를 임력하세요.(km단위)");

        int intValue = scanner.nextInt();

        if (intValue <= 1) {
            System.out.println("도보");
        } else if (intValue <= 10) {
            System.out.println("자전거");
        } else if (intValue <= 100) {
            System.out.println("자동차");
        } else if (intValue <= 1000) {
            System.out.println("비행기");
        }
    }
}
