interface bicycle {
    public void changeGear(int a);

    public void speedUp(int a);
}

class hero implements bicycle {
    int speed;
    int gear;

    @Override
    public void changeGear(int g) {
        gear = g;
    }

    @Override
    public void speedUp(int boost) {
        speed = speed + boost;
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}

public class interfaces {
    public static void main(String[] args) {
        hero h = new hero();
        h.changeGear(2);
        h.speedUp(3);
        h.printStates();
    }
}
