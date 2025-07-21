package 세번째;

public class 반복문제3 {
    public static void main(String[] args) {

        int max = 4;

        int sum = 0;
        int i = 1;
        while (i <= max) {
            sum += i;
            System.out.println("//i=" + i);
            System.out.println(sum);
            i++;
        }
    }
}
