package reviewall.Array;

public class Array5 {

    public static void main(String[] args) {
        int[][] arr=new int[5][5];
        for(int j = 0; j < 5; j++){
            for(int k = 0; k < 5; k++){
                arr[j][k] = k*j;
            }
        }

        for (int j = 0; j < 5; j++) {
            for(int k = 0; k < 5; k++){
                System.out.print(arr[j][k] + " - " + j +"번줄" + k + "줄 /");
            }
            System.out.println();
        }




    }
}
