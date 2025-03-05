class Parent {
    public int a;

    public void show() {
        System.out.println("Parent class show method");
    }
}

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("Child class show method");
    }
    
    public void display() {
        System.out.println("Child class display method");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();
        Child c = new Child();
        c.show();
        c.display();
    }
}
