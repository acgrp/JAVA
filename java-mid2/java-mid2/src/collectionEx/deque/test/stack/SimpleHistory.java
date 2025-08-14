package collectionEx.deque.test.stack;

import java.util.Deque;
import java.util.LinkedList;

public class SimpleHistory {

    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.push("youtube.com");
        stack.push("google.com");
        stack.push("facebook.com");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
