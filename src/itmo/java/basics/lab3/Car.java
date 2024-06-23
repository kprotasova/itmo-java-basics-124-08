package itmo.java.basics.lab3;

public class Car {
    private String name;
    private String color;
    private int weight;

    public Car() {}
    public Car (String color) {
        this.color = color;
    }
    public Car (String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void toConsole () {
        System.out.println(this.toString());
    }

    public static void testMethod() {
        Car audi = new Car();
        Car bmw = new Car();

        audi.setName("Audi11");
        audi.setColor("blue");
        audi.setWeight(12345);

        bmw.setName("bmw22");
        bmw.setColor("black");
        bmw.setWeight(12346);

        audi.toConsole();
        bmw.toConsole();
    }

    public static void main(String[] args) {
        testMethod();
    }
}
