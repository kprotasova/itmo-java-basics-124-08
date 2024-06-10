package itmo.java.basics.lab1;

import java.util.Scanner;

public class Main {

    public static void giveLines () {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
    }

    public static double doMath1() {
        return (46+10) * ((double)10/3);
    }

    public static int doMath2() {
        return (29) * (4) * (-15);
    }

    public static void someMaths() {
        int number = 10500;
        double result = ((double)number/10)/10;
        System.out.println (result);
    }

    public static double multiply() {
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result = a * b * c;
        return result;
    }

    public static void scan() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int b = scanner.nextInt();
            System.out.println(b);
        }
    }

    public static void whatNumber() {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b % 2 == 1) {
            System.out.println("Нечетное");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Четное");
        }
    }

    public static void main(String[] args) {
        whatNumber();
    }
}
