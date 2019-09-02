import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class getmapvalue {
    public static void main(String[] args) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("2", 20);
        stringObjectHashMap.put("1", 10);

        stringObjectHashMap.put("3", 30);
        stringObjectHashMap.put("4", 40);

       /* Set<String> strings = stringObjectHashMap.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
*/

            Set<Map.Entry<String, Object>> entries = stringObjectHashMap.entrySet();
           /* Iterator<Map.Entry<String, Object>> iterator1 = entries.iterator();
            while (iterator1.hasNext()) {
                Map.Entry<String, Object> next = iterator1.next();
                System.out.println(next.getKey());
                System.out.println(next.getValue());
            }*/

      /*  for (Map.Entry<String, Object> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }*/

        Set<String> strings = stringObjectHashMap.keySet();
        for (String string : strings) {
            System.out.println(string);

        }

    }

    }
