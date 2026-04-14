package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");
        map.put("k1", "hoho");

        System.out.println(map.get("k1"));

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);

            System.out.println(key + " : " + value);
        }

        System.out.println("================");
        for (String key : keySet){
            System.out.println(key + " : " + map.get(key));
        }
    }
}