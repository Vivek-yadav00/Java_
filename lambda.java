interface demo{
    void method1();
} 

public class lambda {
    public static void main(String[] args) {
        demo d=()->{
            System.out.println("Method 1 implementation in lambda expression");
        };
        d.method1();
    }
}
