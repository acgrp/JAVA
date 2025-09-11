package reviewall.Array;

public class Array6 {

    public static void main(String[] args) {
        int count = 1;
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for
        for (int j = 0; j < 5; j++) {
            int number = numbers[j];
            System.out.print(number);
        }

        System.out.println();
        //향상된 for
        for(int arr : numbers) { //numbers값을 하나씩 arr에 넣고 실행 반복 (numbers의 끝까지), arr은 numbers의 값 저장하는 곳
            System.out.print(arr);
        }

    }
}
