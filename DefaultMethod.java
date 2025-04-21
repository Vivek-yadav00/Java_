// import java.util.Scanner;

interface mycamera {
    void takesnaps();

    void recordvideo();

    default void record4kvideo() {
        System.out.println("Recording 4k video....");
    }
}

interface mywifi {
    String[] getnetwork();

    void connectnetwork(String network);
}

class MYCellphone {

    void callnumber(int number) {
        System.out.println("Calling " + number);
    }

    void pickcall() {
        System.out.println("Connecting....");
    }

}

class Mysmartphone extends MYCellphone implements mycamera, mywifi {
    public void takesnaps() {
        System.out.println("Taking snaps....");
    }

    public void recordvideo() {
        System.out.println("Recording video....");
    }
    public void record4kvideo() {
        System.out.println("Recording video in 4k....");
    }

    public String[] getnetwork() {
        String[] networks = { "Airtel", "Jio", "BSNL" };
        return networks;
    }

    public void connectnetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        {
            Mysmartphone m = new Mysmartphone();
            m.record4kvideo();
            String[] ar = m.getnetwork();
            for (String i : ar) {
                System.out.println(i);
            }
        }
    }
}
