import java.util.ArrayDeque;

public class ArrDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> d=new ArrayDeque<>();
        d.add(23);
        d.addLast(834);
        d.add(92);
        d.addFirst(46);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
    }
}
