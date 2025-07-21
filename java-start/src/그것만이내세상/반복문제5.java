package 그것만이내세상;

public class 반복문제5 {
    public static void main(String[] args) {

        int rows = 5;
        int B = 0;
        for (int i = 1; i <= rows; i+=2) {
            for (int j = 1; j <= i; j++) {

                    System.out.print("*");
                }
            System.out.println();

        }
    }
}
