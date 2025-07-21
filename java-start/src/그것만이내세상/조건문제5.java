package 그것만이내세상;

public class 조건문제5 {
    public static void main(String[] args) {

        String grade = "D";

        switch (grade) {
            case "A" -> System.out.println("굉장하구만");
            case "B" -> System.out.println("아쉽구만");
            case "C" -> System.out.println("실망스럽구만");
            case "D" -> System.out.println("...");
            case "F" -> System.out.println("그동안즐거웠네");
        }
    }
}
