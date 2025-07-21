package 그것만이내세상;

public class 매서드문제2 {

    public static void main(String[] args) {
        printmessage("Hello, woorld!", 3);
    }

    public static void printmessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}