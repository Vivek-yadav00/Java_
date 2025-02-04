import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a= sc.nextInt();
        do{
            a--;
            System.out.println(a);
        }while(a>5);
        sc.close();
    }

}
