package cond;

public class 문제5 {

    public static void main(String[] args) {
        String grade = "A";

        switch (grade) {
            case "A":
                System.out.println("탁월");
                break;
            case "B":
                System.out.println("좋음");
                break;
            case "C":
                System.out.println("준수");
                break;
            case "D":
                System.out.println("향상요구");
                break;
            case "F":
                System.out.println("불합격");
                break;
            default:
                System.out.println("잘못된 학점입니다");
        }
    }
}
