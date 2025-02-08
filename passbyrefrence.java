
public class passbyrefrence {
    static void tellJoke() {
        System.out.println("Why did the scarecrow win an award?");
        System.out.println("Because he was outstanding in his field!");
    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    public static void main(String[] args) {
        tellJoke();
        int[] arr = { 12, 32, 11, 67, 87 };
        change2(arr);
        System.out.println("The value of arr[0] is: " + arr[0]);
    }
}
