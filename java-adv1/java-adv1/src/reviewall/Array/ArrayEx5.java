package reviewall.Array;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        int recode = 0;
        int recodestudent = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("학생 수를 입력하시오");
        int n = sc.nextInt();
        int[][] student1 = new int[n][3];
        String[] subject = {"국어", "수학", "영어"};

        for (int i = 0; i < student1.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요");
            for (int j = 0; j < student1[i].length; j++) {
                int score = sc.nextInt();
                student1[i][j] = score;
            }
        }
        for (int i = 0; i < student1.length; i++) {
            System.out.println((i+1) + "번 학생의 성적");
            for (int j = 0; j < 3; j++) {
                System.out.println(subject[j] + "점수 : " +  student1[i][j]);
            }
        }


        for (int i = 0; i < student1.length; i++) {
            int total = 0;
            int average = 0;
            for (int j = 0; j < student1[i].length; j++) {
                total += student1[i][j];
                average = total / student1[i].length;
            }
            System.out.print((i+1) + "번 학생의 총점 : " + total + "/" + (3*100) + ", ");
            System.out.print("평균 : " + average);
            System.out.println();
            if (recode < total) {
                recode = total;
                recodestudent = i+1;
            }
        }
        System.out.println("성적 1등은 : " +  recode + "점으로 ," + recodestudent + "번 학생입니다.");


    }
}
