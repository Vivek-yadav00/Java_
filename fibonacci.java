import java.util.Scanner;

public class fibonacci {
    static int fibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return (fibo(n - 1) + fibo(n - 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci sum till " + n + " position is: " + fibo(n));
        sc.close();
    }
}
