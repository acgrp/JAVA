package 코테코테;

public class squareNum {
    public static void main(String[] args) {
        squareNum tetEst = new squareNum();

        int solution1 = tetEst.solution(10000);

        System.out.println(solution1);
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (i * i == n) {
                return answer = 1;
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}
