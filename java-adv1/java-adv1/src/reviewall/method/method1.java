package reviewall.method;

public class method1 {

    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println(sum1);
        int sum2 = add(5, 50);
        System.out.println(sum2);
        add(20, 100); //이 경우에는 반환타입을 저장하지않고 그저 연산만 진행하고 사라짐
    }

    private static int add(int i, int i1) {  //메서드의 기본(public은 다른 클래스에서 사용가능, static은 객체생성X), void가 없으면 뭐라도 반환해야함(예, false)
        System.out.println("메서드 수행");
        System.out.println(i + " + " + i1 + " 연산 수행");
        return i1 + i;
    }
}
