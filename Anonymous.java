interface demo{
    void method1();
    void method2();
}

class actual implements demo{
    public void function(){
        demo d= new demo(){
            @Override
            public void method1() {
                System.out.println("Method 1 implementation");
            }
            @Override
            public void method2() {
                System.out.println("Method 2 implementation");
            }
        };
        d.method1();
        d.method2();
    }
    public void method1() {
        System.out.println("Method 1 implementation in actual class");
    }
    public void method2() {
        System.out.println("Method 2 implementation in actual class");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        // demo d= new demo(){
        //     @Override
        //     public void method1() {
        //         System.out.println("Method 1 implementation");
        //     }
        //     @Override
        //     public void method2() {
        //         System.out.println("Method 2 implementation");
        //     }
        // };
        // d.method1();
        // d.method2();
        actual a= new actual();
        a.function();
        };
    }

