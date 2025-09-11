package reviewall.Array;

public class Array3 {

    public static void main(String[] args) {
        int[][] arr=new int[2][2]; //index가 아닌 진짜 길이
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=4;
        arr[1][1]=5;

        for (int j = 0; j < arr.length; j++) {
            for(int k = 0; k < arr[j].length; k++){
                System.out.print(arr[j][k] + " - " + j +"번줄" + k + "줄 /");
            }
            System.out.println();
        }




    }
}
