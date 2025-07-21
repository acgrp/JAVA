package 세번째;

import java.util.Scanner;

public class 조건문제4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("평점을 적어주세요.");

        double rating = scanner.nextDouble();

        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'토이스토리'을 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("'고질라'을 추천합니다.");
        }
    }
}
