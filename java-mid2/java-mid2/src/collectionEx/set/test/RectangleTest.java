package collectionEx.set.test;

import java.util.HashSet;

public class RectangleTest {

    public static void main(String[] args) {
        HashSet<Rectangle> rectangleSet = new HashSet<>();
        rectangleSet.add(new Rectangle(10, 10));
        rectangleSet.add(new Rectangle(20, 20));
        rectangleSet.add(new Rectangle(20, 20)); //중복(단, Rectangle에 equals랑 hashcode를 Override하면 가능)

        for(Rectangle rectangle : rectangleSet){
            System.out.println("rectangle = " + rectangle);
        }
    }
}
