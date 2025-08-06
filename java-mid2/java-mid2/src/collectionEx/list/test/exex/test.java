package collectionEx.list.test.exex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        int count = 0;

        System.out.println("숫자 5개");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(1) == numbers.get(i)){
                count ++;
            }
        }
        System.out.println(count);
    }
}
