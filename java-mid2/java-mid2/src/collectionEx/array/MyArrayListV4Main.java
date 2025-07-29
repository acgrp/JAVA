package collectionEx.array;

public class MyArrayListV4Main {

    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
//        stringList.add(1);  //제네릭타입에서 E를 String로 선언 했기때문에 불가능
        String string = stringList.get(0);
        System.out.println("string = " + string);

        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
//        intList.add("a");   //E를 Integer로 먼저 선언 했기때문에 불가능
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);
    }
}
