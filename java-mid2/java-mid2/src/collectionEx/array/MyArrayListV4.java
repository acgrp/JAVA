package collectionEx.array;

import java.util.Arrays;

public class MyArrayListV4<E> {

    private static final int DEFFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {

        elementData = new Object[DEFFAULT_CAPACITY]; //E에는 new 명령어를 사용할수 없음
    }  //생성자에 E불가능

    public MyArrayListV4(int initialCapacity) {

        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E e){

        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }
    //코드 추가
    public void add(int index, E e){
        if (size == elementData.length) {
            grow();
        }
        //데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }
    //코드 추가, 요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    private void grow() {
        int newCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
        }

    @SuppressWarnings("unchecked")  // 경고를 무시하겠다는 뜻
    public E get(int index){

        return (E) elementData[index]; //안되기때문에 (E)로 캐스팅
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    //코드 추가
    public E remove(int index) {
        E oldValue = get(index);
        //데이터 이동
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return oldValue;
    }

    //코드 추가 요소의  index부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        //[1,2,3,null,null] // size = 3
        //[1,2,3] // size = 3
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" + size + ", capacity=" + elementData.length;
    }
}
