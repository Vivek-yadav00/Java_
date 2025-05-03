class MyGeneric<T1, T2> {
    int val;
    private T1 x;
    private T2 y;

    MyGeneric(int val, T1 x, T2 y) {
        this.val = val;
        this.x = x;
        this.y = y;
    }

    public int getVal() {
        return val;
    }

    public T1 getT1() {
        return x;
    }

    public T2 getT2() {
        return y;
    }

}

public class Generic {
    public static void main(String[] args) {
        MyGeneric<String, Integer> g = new MyGeneric<String, Integer>(86, "Vivek", 24);
        String str = g.getT1();
        System.out.println("String: " + str);
        Integer a = g.getT2();
        System.out.println("Integer: " + a);
        Integer b = g.getVal();
        System.out.println("Integer: " + b);
    }
}
