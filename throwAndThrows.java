class ZeroDivision extends Exception {
    @Override
    public String toString() {
        return "Divided by zero exception";
    }

    @Override
    public String getMessage() {
        return "Divided by zero not allowed";
    }
}

public class throwAndThrows {
    public static int divide(int a, int b) throws ZeroDivision {
        if (b == 0) {
            throw new ZeroDivision();
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int c = divide(5, 0);
            System.out.println(c);
        } 
        catch (ZeroDivision e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
