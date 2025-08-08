package collectionEx.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPCITY = 16;

    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capcity = DEFAULT_INITIAL_CAPCITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capcity) {
        this.capcity = capcity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capcity];
        for (int i = 0; i < capcity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value){
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean result = bucket.remove(Integer.valueOf(value));//레퍼타입(?), 값을 지우는것 : (value)만 사용하면 index값 자체를 지워버림
        if(result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private static boolean extracted(int searchValue, LinkedList<Integer> bucket) {
        boolean contains = bucket.contains(searchValue);
        return contains;
    }

    private int hashIndex(int index) {
        return index % capcity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capcity=" + capcity +
                '}';
    }
}
