package reviewall.Array;

public class Array4 {

    public static void main(String[] args) {
        int[][] arr={
                {1, 4, 6},
                {5, 2, 5}
        };


        for (int j = 0; j < arr.length; j++) {
            for(int k = 0; k < arr[j].length; k++){
                System.out.print(arr[j][k] + " - " + j +"번줄" + k + "줄 /");
            }
            System.out.println();
        }




    }
}
