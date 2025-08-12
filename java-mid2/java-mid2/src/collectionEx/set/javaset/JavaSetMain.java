package collectionEx.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet();
        Set<String> LinkedHashSet = new LinkedHashSet<>();
        Set<String> TreeSet = new TreeSet<>();

        run(hashSet);
        run(LinkedHashSet);
        run(TreeSet);
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }
}
