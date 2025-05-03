import java.util.ArrayList;
import java.util.*;

public class Arraylists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add to the ArrayList: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            String element = sc.nextLine();
            list.add(element);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("First element: " + list.get(0));
        System.out.println("Second element: " + list.get(1));

        list.remove(1);
        System.out.println("After removing second element: " + list);

        for (String str : list) {
            System.out.println(str);
        }
        sc.close();
    }
}
