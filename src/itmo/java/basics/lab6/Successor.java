package itmo.java.basics.lab6;

public class Successor extends Head {

    public Successor (int n) {
        super (n);
    }

    public void displayN() {
       System.out.println(n);
    }

    public static void main(String[] args) {
        Successor successor = new Successor(1);
        successor.displayN();
    }
}
