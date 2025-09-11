package reviewall.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        int count = 0;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 크기를 정하시오");
        int n = sc.nextInt();
        int[] student1 = new int[n];

        System.out.println(n + "개의 값을 입력하시오");
        while (count < n){
            student1[count] =  sc.nextInt();
            count++;
        }
        for (int i = 0; i < student1.length; i++) {
            total += student1[i];
        }

        System.out.print("입력한 숫자(역순) : ");
        for (int i = (n-1); i >= 0; i--) {
            System.out.print(student1[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("입력한 숫자의 총 합" + total);
        double average = (double) total / student1.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
