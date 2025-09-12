package reviewall.method;

public class overloadingEx2 {

    public static void main(String[] args) {
        HelloWorld("Hello, World", 3);
        HelloWorld("Hello, World", 5);
        HelloWorld("Hello, World", 7);

    }
    public static void HelloWorld(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
}