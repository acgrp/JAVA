package 그것만이내세상;

import java.util.Scanner;

public class 배열문제6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int num = scanner.nextInt();

        int[] numbers = new int[num];
        int minNumber, maxNumber;

        System.out.println(num + "개의 정수를 입력하세요: ");
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNumber = maxNumber = numbers[0];
        for (int i = 1; i < num; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);

        }
    }
