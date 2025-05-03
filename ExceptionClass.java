import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a= sc.nextInt(); 
        if (a < 9) {
            try {
                throw new MyException();
            } 
            catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        sc.close();
    }
}
