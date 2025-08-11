package CoTe;

import java.util.ArrayList;
import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();


        System.out.println("단어를 입력하세요(exit 입력시 종료)");
        while (true) {
            String input = word.next();

            if (input.matches("\\d+")){
                continue;
            }
            if (input.equals("exit")) {
                break;
            }

            words.add(input);
        }
        System.out.println("정렬 전 : " + words);


        words.sort((a, b) -> {
            if(a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return a.compareTo(b);
            }
        });

        System.out.println("정렬 후 : " + words);
    }
}
