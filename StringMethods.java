import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String name = sc.nextLine();
        System.out.println(name);
        int l = name.length();
        System.out.println("The length of the string is: " + l);
        sc.close();
    }
}