package CoTe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        int countline = 0;

        System.out.println("점의 갯수를 적어주세요");
        int n = sc.nextInt();

        int[][] arrays = new int[n][2];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번째 배열의 값 2개 입력");
            arrays[i][0] = sc.nextInt();
            arrays[i][1] = sc.nextInt();
        }

        Map<Integer, Integer> xCount = new HashMap<>();
        Map<Integer, Integer> yCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = arrays[i][0];
            int y = arrays[i][1];
        }
    }
}
