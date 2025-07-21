package 세번째;

public class 반복문제4 {
    public static void main(String[] args) {

        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}
