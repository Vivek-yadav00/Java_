import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        System.out.println("Student makrs: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = a + b + c + d;
        float div = (sum / 400f) * 100;
        System.out.println("The percentage of the student is: " + div);
        sc.close();
    }
}