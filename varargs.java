public class varargs {
    static int sum(int... numbers) {
        int result = 0;
        for (int a : numbers) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("required sum is: " + sum(1, 2));
        System.out.println("required sum is: " + sum(1, 2, 3));
        System.out.println("required sum is: " + sum(1, 2, 3, 4));
        System.out.println("required sum is: " + sum(1, 2, 3, 4, 5));
    }
}
