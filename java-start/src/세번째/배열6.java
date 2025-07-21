package 세번째;

import java.util.Scanner;

public class 배열6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int min, max;

        System.out.println(count + "개의 정수를 입력하세요");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }


        min = numbers[0];
        max = numbers[0];
        for (int i = 1; i < count; i++ ) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("제일 작은건 : " + min);
        System.out.println("제일 큰건 : " + max);

    }
}
