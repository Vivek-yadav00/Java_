import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        while (number >= 0) {
            sum += number;
            number--;
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
