package collectionEx.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("학생A", 80);
        System.out.println(studentMap);

        //학생이 없는 경우에만 데이터 추가1
        if (!studentMap.containsKey("학생A")) {
            studentMap.put("학생A", 100);
        }
        System.out.println(studentMap);

        //학생이 없는 경우에만 데이터 추가1
        studentMap.putIfAbsent("학생A", 110);
        studentMap.putIfAbsent("학생B", 120);
        System.out.println(studentMap);
    }
}
