class Phone {

    public void showTime() {
        System.out.println("Time is 8 am");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {

    public void music() {
        System.out.println("Playing music...");
    }

    public void on() {
        System.out.println("Turning on SmartPhone...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone(); // This is called Dynamic Method Dispatch
        obj.showTime();
        obj.on();
        // obj.music(); // Not allowed
    }
}
