class Emp {
    int id;
    String name;

    public void display() {
        System.out.println(id + " " + name);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.id = 101;
        e1.name = "John";
        e1.display();
    }
}
