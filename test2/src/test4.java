import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class test4 {
    public static void main(String[] args) {

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(5);
        integers.add(2, 33);
        integers.removeLast();
        System.out.println(integers);
    }
}
