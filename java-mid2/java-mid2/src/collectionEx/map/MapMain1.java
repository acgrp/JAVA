package collectionEx.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학교 성적 데이터 추가
        studentMap.put("학생A", 90);
        studentMap.put("학생B", 80);
        studentMap.put("학생C", 70);
        studentMap.put("학생D", 60);
        System.out.println(studentMap);

        // 특정 학생의 값 조회
        Integer result = studentMap.get("학생A");
        System.out.println("학생A = " + result);

        System.out.println("keySey 활용");
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }

    }
}
