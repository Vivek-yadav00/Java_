import java.util.Scanner;

class MyEmp {
    private int id;
    private String name;

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

public class GetSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID and Name: ");
        int id = sc.nextInt();
        String name = sc.nextLine();
        MyEmp emp = new MyEmp();
        emp.setid(id);
        emp.setname(name);
        System.out.println("Name: " + emp.getname());
        System.out.println("ID: " + emp.getid());
        sc.close();
    }
}
