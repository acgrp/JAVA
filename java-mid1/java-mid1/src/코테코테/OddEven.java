package 코테코테;

import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {
        OddEven tetEst = new OddEven();

        int[] solution1 = tetEst.solution(new int[]{1,2,3,4,5,6,7});

        System.out.println(Arrays.toString(solution1));
    }

    public int[] solution(int[] num_list) {

        int[] temp = new int[2];
        int q = 0;
        int w = 0;

        int n = num_list.length;
        for (int i = 0; i < n; i++) {
            if (num_list[i] % 2 == 0) {
                q++ ;
            } else {
                w++ ;
            }
        }
        temp[0] = q;
        temp[1] = w;

        return temp;
    }
}