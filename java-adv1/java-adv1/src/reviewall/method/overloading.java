package reviewall.method;

public class overloading {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));// 첫번째add  호출
        System.out.println("2: " + add(1, 2, 3)); //두번째 add 호출
    }
    // 첫 번째 add 메서드: 두 정수를 받아서 합을 반환한다.
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

// 두 번째 add 메서드: 세 정수를 받아서 합을 반환한다.
// 첫 번째 메서드와 이름은 같지만, 매개변수 목록이 다르다.
 public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
