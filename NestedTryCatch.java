import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 75;
        arr[1] = 45;
        arr[2] = 92;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index:");
        int index = sc.nextInt();
        try {
            System.out.println("Nested try-catch block");
            try {
                System.out.println("The value at index " + index + " is: " + arr[index]);
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
            } 
            catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: " + e);
            }
        } 
        catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } 
        finally {
            System.out.println("Finally block executed");

        }
        sc.close();
    }
}
