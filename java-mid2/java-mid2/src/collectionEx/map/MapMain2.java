package collectionEx.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("학생A", 80);
        System.out.println(studentMap);

        studentMap.put("학생A", 90); //같은 키에 다른 값을 저장하면 기존 값을 교체
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("학생A");
        System.out.println("containsKey = " + containsKey);

        //특정 학생의 값 삭제
        studentMap.remove("학생A");
        System.out.println(studentMap);
    }
}
