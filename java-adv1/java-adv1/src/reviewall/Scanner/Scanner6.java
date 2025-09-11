package reviewall.Scanner;

import java.util.Scanner;

public class Scanner6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        System.out.println("더할 모든 숫자를 적으시오(0을 입력하면 종료)");
        while (true) {
            count++;
            System.out.print(count + "번째 숫자를 입력 : ");
            int num = sc.nextInt();
            sum += num;
            if (num == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
        }
        System.out.println(count+"개의 모든 수의 합 : " + sum);
    }
}
