package collectionEx.set;

import java.util.Arrays;
import java.util.Formattable;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 15;

    public static void main(String[] args) {
        //{1, 2, 5, 8, 14, 99, 9}
        LinkedList<Integer>[] bukets = new LinkedList[CAPACITY];
        System.out.println("Arrays.toString(bukets = " + Arrays.toString(bukets));
        for (int i = 0; i < CAPACITY; i++) {
            bukets[i] = new LinkedList<>();
        }

        System.out.println("bukets = " + Arrays.toString(bukets));

        add(bukets, 1);
        add(bukets, 2);
        add(bukets, 5);
        add(bukets, 8);
        add(bukets, 14);
        add(bukets, 99);
        add(bukets, 9); //중복
        System.out.println("bukets = " + Arrays.toString(bukets));

        //검색
        int searchValue = 9;
        boolean contains = contains(bukets, searchValue);
        System.out.println("searchValue + \"= \" + contains = " + searchValue + " = " + contains);


    }
    private static void add(LinkedList<Integer>[] bukets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> buket = bukets[hashIndex];
        if (!buket.contains(value)) {
            buket.add(value);
        }
    }

    static int hashIndex(int index) {
        return index % CAPACITY;
    }

    private static boolean contains(LinkedList<Integer>[] bukets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> buket = bukets[hashIndex];     //O(1)
        return buket.contains(searchValue);  //배열안에 있는걸 다 뒤져서 찾음 O(n)

//        for (Integer integer : buket){
//            if(integer == searchValue){
//                return true;                  //List에는 contains가 있음 그러므로 필요x
//            }
//        }
//        return false;
    }
}
