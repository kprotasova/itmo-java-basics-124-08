package itmo.java.basics.lab3;

public class Tree {
    private int age;
    private boolean isAlive;
    private String name;

    public Tree (int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree (int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void constructorMethod() {
        Tree tree1 = new Tree (11, "oak");
        Tree tree2 = new Tree (3, true, "appletree");
        Tree tree3 = new Tree();
    }
}
