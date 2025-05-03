import java.util.HashMap;
import java.util.*;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add to the HashMap: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter key " + (i + 1) + ": ");
            String key = sc.nextLine();
            System.out.println("Enter value " + (i + 1) + ": ");
            int value = sc.nextInt();
            sc.nextLine(); 
            map.put(key, value);
        }

        System.out.println("HashMap: " + map);
        System.out.println("Size of HashMap: " + map.size());
        System.out.println("Value for key 'key1': " + map.get("key1"));
        System.out.println("Value for key 'key2': " + map.get("key2"));

        map.remove("key2");
        System.out.println("After removing key 'key2': " + map);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        sc.close();
    }
}
