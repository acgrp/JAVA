package collectionEx.list.test.exex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class retest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();


        int count = 0;
        System.out.println("문자를 입력하세요(0번 정지)");
        while (true) {
            int num = sc.nextInt();
            numbers.add(num);
            if(num == 0){
                break;
            }
        }

        System.out.println("입력한 숫자 갯수: " + numbers.size());
        System.out.println("입력한 숫자: " + numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == 15){
                count++;
            }
        }
        System.out.println("15의 갯수는: " + count);
        System.out.println("15가 아닌 수는: " + (numbers.size() - count));
    }
}
