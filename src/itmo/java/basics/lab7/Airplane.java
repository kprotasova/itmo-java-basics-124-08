package itmo.java.basics.lab7;

public class Airplane {

    public Wing wing = new Wing();

    public void setWeight (double weight) {
        this.wing.setWeight(weight);
    }

    public void displayWeight() {
        this.wing.displayWeight();
    }

    public class Wing {
        private double weight;

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void displayWeight() {
            System.out.println("Вес крыла: " + this.weight);
        }
    }

    public static void main(String[] args) {
        Airplane plane1 = new Airplane();
        Airplane plane2 = new Airplane();

        plane1.setWeight(1234.12);
        plane2.setWeight(4321.43);

        plane1.displayWeight();
        plane2.displayWeight();
    }
}
