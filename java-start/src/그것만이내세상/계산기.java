package 그것만이내세상;

import java.util.Scanner;

public class 계산기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 수를 입력하세요: ");
        int intValue1 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("부호를 입력하세요(+, -, /, *) ");
        String str = scanner.nextLine();

        System.out.print("두번째 수를 입력하세요: ");
        int intValue2 = scanner.nextInt();

        switch (str) {
            case "+" -> {
                System.out.println("값은: " + (intValue1 + intValue2));
            }
            case "-" -> {
                System.out.println("값은: " + (intValue1 - intValue2));
            }
            case "*" -> {
                System.out.println("값은: " + (intValue1 * intValue2));
            }
            case "/" -> {
                if (intValue2 != 0) {
                    System.out.println("값은: " + (intValue1 / intValue2));
                } else {
                    System.out.println("나누기에 0을 사용할수 없습니다.");
                }
            }
            default -> System.out.println("잘못된 입력입니다.");
        }
    }
}
