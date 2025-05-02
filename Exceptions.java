import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = 34;
        arr[1] = 42;
        arr[2] = 22;

        System.out.println("Enter the index of the array : ");
        int index = sc.nextInt();

        System.out.println("Enter the number to be divided by : ");
        int num = sc.nextInt();

        try {
            System.out.println("The value at array index entered is " + arr[index]);
            System.out.println("The number after division is : " + arr[index] / num);
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic caught : " + e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught : " + e);
        } 
        catch (Exception e) {
            System.out.println("Exception caught : " + e);
        }

        sc.close();
    }
}
