package 세번째;

import java.util.Scanner;

public class 조건문제5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학점을 적어주세요. :");

        String grade = scanner.nextLine();

        switch (grade) {
            case "A":
                    System.out.println("a입니다.");
                    break;
                case "B":
                    System.out.println("b입니다.");
                    break;
                case "C":
                    System.out.println("c입니다.");
                    break;
                case "D":
                    System.out.println("d입니다.");
                    break;
                case "F":
                    System.out.println("f입니다.");
                    break;
                default:
                    System.out.println("잘못된 점수입니다.");
        }
    }
}
