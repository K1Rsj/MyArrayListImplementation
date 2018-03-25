import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskWithArrayList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,6,4,5,3,4,2,4,5,7);
        HashMap<Integer, Integer> ourMap = getKeysFromListWithCount(list);
        for(Map.Entry<Integer, Integer> pair : ourMap.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }

    public static HashMap<Integer, Integer> getKeysFromListWithCount(List<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer s : list) {
            int count = 1;
            if (map.containsKey(s)) {
                count = map.get(s);
                map.put(s, count += 1);
            }
            else {
                map.put(s, count);
            }
        }
        return map;
    }
}
