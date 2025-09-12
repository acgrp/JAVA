package reviewall.method;

public class overloadingEx1 {

    public static void main(String[] args) {
        average(1, 2, 3);
        average(15, 25, 35);
    }
    public static double average(int a, int b, int c) {
        System.out.println("평균값 출력 : " + ((a+b+c)/3.0));
        return 0;
    }

}