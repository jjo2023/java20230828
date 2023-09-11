package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C12map {
    public static void main(String[] args) {
        // Map : key, value 쌍(entry)를 저장
        // key가 중복된 entry가 있을 수 없다.

        // Map은 인터페이스이므로... 객체를 만들 수 없음
        // 별일없으면 걍 HashMap쓰면 된다.
        Map<String, String> map = new HashMap<>();
        
        // put : entry 추가 메소드
        map.put("student1", "손흥민");
        map.put("student2", "이강인");
        map.put("student3", "김민재");

        // size : entry 갯수 확인
        System.out.println("map.size() = " + map.size());

        // entry 교체 메소드
        map.put("student3","박지성");
        
        // entry 삭제 메소드, key가 중복되지 않기 때문에 key만 알아도 삭제가능
        map.remove("student2");
        
        // get : entry의 value를 얻는 메소드
        String s = map.get("student1");
        System.out.println("s = " + s);
        System.out.println("map.get(\"student3\") = " + map.get("student3"));
        System.out.println("map.get(\"student2\") = " + map.get("student2"));
                                          // ↑ student2 remove 했으므로 반환 값은 null



        
        
        
    }
}
