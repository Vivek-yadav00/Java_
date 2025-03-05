import java.util.Scanner;

class Base {
    int x;

    Base(int a) {
        this.x = a;
    }

    public void show() {
        System.out.println("Base class value of x is: " + x);
    }
}

class Derived extends Base {
    private int y;

    Derived(int m, int n) {
        super(m);
        this.y = n;
    }

    public int getY() {
        return y;
    }

    public void show() {
        System.out.println("Base class value of x in derived class: " + x);
        System.out.println("Derived class value of y is: " + getY());
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        Base b = new Base(a);
        b.show();
        System.out.println("Enter another number: ");
        int c = sc.nextInt();
        Derived d = new Derived(a, c);
        d.show();
        sc.close();
    }
}
