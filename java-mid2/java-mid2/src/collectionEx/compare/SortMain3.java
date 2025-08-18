package collectionEx.compare;

import java.util.Arrays;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser myuser1 = new MyUser("a", 30);
        MyUser myuser2 = new MyUser("b", 20);
        MyUser myuser3 = new MyUser("c", 10);

        MyUser[] array = {myuser1, myuser2, myuser3};
        System.out.println(Arrays.toString(array));


        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //추가
        System.out.println("IdComparator");
        Arrays.sort(array, new IdComparator());
        System.out.println(Arrays.toString(array));
        System.out.println("IdComparator.re");
        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array));
    }


}
