package itmo.java.basics.lab6;

public class Truck extends Car {
    private int amountWheels;
    private int maxWeight;

    public Truck (int w, String m, char c, float s, int amountWheels, int maxWeight) {
        super (w, m, c, s);
        this.amountWheels = amountWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels (int newAmountWheels) {
        this.amountWheels = newAmountWheels;
        System.out.println(this.amountWheels);
    }
}
