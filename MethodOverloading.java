public class MethodOverloading {
    static void foo() {
        System.out.println("Good Morning!");
    }
    static void foo(String a) {
        System.out.println("Good Morning! " + a);
    }
    static void foo(String a,String  b) {
        System.out.println("Good Morning! " + a + " and " + b);
    }
    public static void main(String[] args) {
        foo();
        foo("Bill");
        foo("Bill", "Steve");
    }
}
