package itmo.java.basics.lab6;

public class Child extends Parent {
    @Override
    public void getSomeInformation() {
        System.out.println("Введите ваше имя");
        String name = scanner.next();
        this.name = name;
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.getSomeInformation();
    }
}
