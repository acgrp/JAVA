package 그것만이내세상;

public class 조건문제3 {
    public static void main(String[] args) {

        int dollar = -1;

        if (dollar > 0) {
            System.out.println("환전금액은 " + dollar*1300 + "입니다.");
        } else if (dollar == 0) {
            System.out.println("돈이 없슈");
        } else {
            System.out.println("장난나랑 지금하냐");
        }
    }
}
