package reviewall.Array;

public class Array2 {

    public static void main(String[] args) {
        int[] students;

        int x = 5;
        students= new int[]{90+x, 80+x, 70+x, 60+x, 50+x};



        for (int j = 1; j <= 5; j++) {
            System.out.println("학생 " + j + "번 : " + students[j - 1]);
        }
    }
}
