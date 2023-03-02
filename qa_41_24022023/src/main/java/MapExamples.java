import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        map.put(1906411, "Hamburg");
        map.put(3677472, "Berlin");
        map.put(1487708, "Munich");
        map.put(101516, "Siegen");
        map.put(101158, "Gütersloh");
        map.put(100319, "Hildesheim");

        System.out.println(map);
    }
}
