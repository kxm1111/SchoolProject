import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class MapDemo4 {
    public static void main(String[] args) {

        List<String> data = new ArrayList<>();
        String[] selects = {"A", "B", "C", "D"};
        Random r = new Random();
        for (int i = 1; i <= 80; i++) {

            int index = r.nextInt(4); // 0 1 2 3
            data.add(selects[index]);
        }
        System.out.println(data);
        Map<String, Integer> result = new HashMap<>();

        for (String s : data) {

            if (result.containsKey(s)) {

                result.put(s, result.get(s) + 1);
            } else {

                result.put(s, 1);
            }
        }
        System.out.println(result);
    }
}