package method;

public class methodValue1 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changgeNumber 호출 전, num1: " + num1);
        changNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1:" + num1);
    }

    public static void changNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2:" + num2);
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + num2);
    }
}
