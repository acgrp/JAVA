package collectionEx.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPCITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capcity = DEFAULT_INITIAL_CAPCITY;

    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capcity) {
        this.capcity = capcity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capcity];
        for (int i = 0; i < capcity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value){
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);//레퍼타입(?), 값을 지우는것 : (value)만 사용하면 index값 자체를 지워버림
        if(result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

//    private static boolean extracted(Objects searchValue, LinkedList<Objects> bucket) {
//        boolean contains = bucket.contains(searchValue);
//        return contains;
//    }

    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) % capcity; //Math.abs() : 절대값을 구하는 코드
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capcity=" + capcity +
                '}';
    }
}
