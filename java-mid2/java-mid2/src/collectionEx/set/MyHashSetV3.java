package collectionEx.set;

import collection.set.MySet;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;

public class MyHashSetV3<E> implements MySet<E> {

    static final int DEFAULT_INITIAL_CAPCITY = 16;

    private LinkedList<E>[] buckets;

    private int size = 0;
    private int capcity = DEFAULT_INITIAL_CAPCITY;

    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int capcity) {
        this.capcity = capcity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capcity];
        for (int i = 0; i < capcity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(E value){
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);//레퍼타입(?), 값을 지우는것 : (value)만 사용하면 index값 자체를 지워버림
        if(result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(E value) {
        return Math.abs(value.hashCode()) % capcity; //Math.abs() : 절대값을 구하는 코드
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capcity=" + capcity +
                '}';
    }
}
