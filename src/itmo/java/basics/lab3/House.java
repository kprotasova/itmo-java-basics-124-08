package itmo.java.basics.lab3;
import java.time.Year;

public class House {
    private String name;
    private int floor;
    private int year;

    public House(String name, int floor, int year) {
        this.name = name;
        this. floor = floor;
        this. year = year;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", floor=" + floor +
                ", year=" + year +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getFloor() {
        return floor;
    }

    public int getYear() {
        return year;
    }

    public static int howManyYears(House house) {
        int currentYear = Year.now().getValue();
        return currentYear - house.year;
    }

    public static void exerciseMethod() {
        House house1 = new House("dom", 5, 1981);
        House house2 = new House ("domik", 3, 1856);
        System.out.println(house1);
        System.out.println(house2);
    }

    public static void main(String[] args) {
        exerciseMethod();
    }
}
