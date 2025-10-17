package thread.collection.java;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> copySet =  new CopyOnWriteArraySet<>();
        copySet.add(1);
        copySet.add(2);
        copySet.add(3);
        System.out.println("copySet = " + copySet);

        ConcurrentSkipListSet<Object> skipSet = new ConcurrentSkipListSet<>(); //ConcurrentSkipList는 자동으로 정렬해줌, 하기싫으면 괄호안에 cumparator
        skipSet.add(2);
        skipSet.add(1);
        skipSet.add(3);
        System.out.println("skipSet = " + skipSet);
    }
}