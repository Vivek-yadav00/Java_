abstract class Parent {
    Parent() {
        System.out.println("parent class Constructor");
    }

    public void fun() {
        System.out.println("hello");
    }

    abstract void greet1();

    abstract void greet2();
}

class child extends Parent {
    @Override
    public void greet1() {
        System.out.println("Good Morning");
    }

    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        child c = new child();
        c.greet1();
        c.greet2();

    }
}
