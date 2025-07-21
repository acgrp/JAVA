package cond;

public class 문제1 {

    public static void main(String[] args) {
        int score = 70;

        if (score >= 90) {
            System.out.println("A입니다");

        }
        if (90 > score&& score >= 80) {
            System.out.println("B입니다");

        }
        if (80 > score&& score >= 70) {
            System.out.println("C입니다");
        }
        if (70 > score&& score >= 60) {
            System.out.println("D입니다");
        }
        if (60 > score) {
            System.out.println("F입니다");
        }
    }

}
