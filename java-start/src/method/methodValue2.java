package method;

public class methodValue2 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changgeNumber 호출 전, num1: " + num1);
        changNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1:" + num1);
    }

    public static int changNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}