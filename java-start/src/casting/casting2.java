package casting;

public class casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intVlaue = 0;

        //intVlaue = doubleValue; //컴파일 오류 발생
        intVlaue = (int)doubleValue; //형변환
        System.out.println(intVlaue);
        System.out.println("doubleValue = " + doubleValue);

    }
}
