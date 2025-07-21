package 그것만이내세상;

import java.util.Scanner;

public class 스캐너7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.print("숫자를 입력하세요. (-1를 입력하면 종료): ");
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }
            sum += num;
            count++;

        }
        System.out.println("입력한 숫자들의 합계 :" + sum);
        System.out.println("입력한 숫자들의 평균 :" + (sum / count));

    }
}
