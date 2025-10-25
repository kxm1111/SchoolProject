import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest11 {
    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();
        map.put("蜘蛛精", 162.5);
        map.put("蜘蛛精", 169.8);
        map.put("紫霞", 165.8);
        map.put("至尊宝", 169.5);
        map.put("牛魔王", 183.6);
        System.out.println(map);
        Set<String> keys = map.keySet();

        for (String key : keys) {

            double value = map.get(key);
            System.out.println(key + "=====>" + value);
        }
    }
}
