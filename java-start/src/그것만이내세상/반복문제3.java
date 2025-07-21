package 그것만이내세상;

public class 반복문제3 {

    public static void main(String[] args) {
        int sum = 0;
        int max = 100;
        int i = 1;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
