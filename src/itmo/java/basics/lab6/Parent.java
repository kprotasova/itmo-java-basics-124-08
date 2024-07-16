package itmo.java.basics.lab6;

import java.util.Scanner;

public class Parent {
    private int age;
    protected String name;
    Scanner scanner = new Scanner(System.in);

    public void getSomeInformation() {
        System.out.println("Введите ваш возраст");
        int age = scanner.nextInt();
        this.age = age;
    }
}
