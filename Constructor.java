import java.util.Scanner;

class MyEmp {
    private int id;
    private String name;

    MyEmp() {
        System.out.println("Default Constructor called");
    }

    MyEmp(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterized Constructor called");
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID and Name: ");
        int id = sc.nextInt();
        String name = sc.nextLine();
        MyEmp emp1 = new MyEmp();
        MyEmp emp2 = new MyEmp(id, name);
        emp2.setid(id);
        emp2.setname(name);
        System.out.println("Name: " + emp2.getname());
        System.out.println("ID: " + emp2.getid());
        sc.close();
    }
}
