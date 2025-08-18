package collectionEx.compare;

import collection.compare.SortMain2;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain1 {
    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));
        System.out.println("Comparator 비교");
        Arrays.sort(array, new SortMain2.AscComparator());
        System.out.println("AscComparator:" + Arrays.toString(array));

        Arrays.sort(array, new SortMain2.DescComparator());
        System.out.println("DescComparator:" + Arrays.toString(array));
        Arrays.sort(array, new SortMain2.AscComparator().reversed()); //DescComparator와 같다.
        System.out.println("AscComparator.reversed:" + Arrays.toString(array));
    }

    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1=" + o1 + " o2=" + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }

    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1=" + o1 + " o2=" + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1) * -1;
        }
    }
}