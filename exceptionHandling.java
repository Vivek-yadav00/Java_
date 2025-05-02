import java.util.*;

public class exceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("The result is: " + c);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
        sc.close();
    }
}
