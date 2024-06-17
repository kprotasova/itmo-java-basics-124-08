package itmo.java.basics.lab2;

public class Human {
    private byte age;
    private String name;
    private String sex;
    private int height;
    private int weight;

    public Human() {};

    public Human (byte age, String name, String sex, int height, int weight) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

