import java.util.Scanner;

public class Methods {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x ^ 2 + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        int c = logic(a, b);
        System.out.println("The value of c is: " + c);
        sc.close();
    }
}
