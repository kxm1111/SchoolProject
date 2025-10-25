import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("手表", 100);
        map.put("手表", 220);
        map.put("手机", 2);
        map.put("Java", 2);
        map.put(null, null);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        int v1 = map.get("手表");
        System.out.println(v1);
        System.out.println(map.get("手机")); // 2
        System.out.println(map.get("张三"));
        System.out.println(map.remove("手表"));
        System.out.println(map);
        System.out.println(map.containsKey("手表")); // false
        System.out.println(map.containsKey("手机")); // true
        System.out.println(map.containsKey("java")); // false
        System.out.println(map.containsKey("Java"));
        System.out.println(map.containsValue(2)); // true
        System.out.println(map.containsValue("2"));
        Set<String> keys = map.keySet();
        System.out.println(keys);
        Collection<Integer> values = map.values();
        System.out.println(values);
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("java1",  10);
        map1.put("java2",  20);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("java3",  10);
        map2.put("java2",  222);
        map1.putAll(map2);
        System.out.println(map1);
        System.out.println(map2);
    }
}



