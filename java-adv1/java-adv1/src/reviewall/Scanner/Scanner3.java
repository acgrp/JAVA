package reviewall.Scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력");
        int num1 = sc.nextInt();

        System.out.println("두번째 숫자를 입력");
        int num2 = sc.nextInt();

        if(num1>num2) {
            System.out.println("더 큰수는 : " + num1);
        } else if(num1==num2) {
            System.out.println("두수는 같다");
        } else {
            System.out.println("더 큰수는 : " + num2);
        }
    }
}
