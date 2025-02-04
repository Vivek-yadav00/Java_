import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String name = sc.nextLine();
        System.out.println(name);
        int len = name.length();
        System.out.println("The length of the string is: " + len);
        String u = name.toUpperCase();
        System.out.println("The string in uppercase is: " + u);
        String l = name.toLowerCase();
        System.out.println("The string in lowercase is: " + l);
        String str = "    Vivek     ";
        System.out.println("Trim strign is: " + str.trim());
        System.out.println("Sub strign is: " + name.substring(2));
        System.out.println("Sub strign is: " + name.substring(1, 4));
        System.out.println("Replace strign is: " + name.replace('v', 'b'));
        System.out.println("Starts with strign is: " + name.startsWith("Vi"));
        System.out.println("Ends with strign is: " + name.endsWith("g"));
        System.out.println("Char at 2nd index is: " + name.charAt(2));

        sc.close();
    }
}