package reviewall.Array;

public class Array1 {

    public static void main(String[] args) {
        int[] students = new int[5];

        for (int i = 1; i <= 5; i++) {
            students[i - 1] = i;
        }

        for (int j = 1; j <= 5; j++) {
            System.out.println("학생 " + j + "번 : " + students[j - 1]);
        }
    }
}
