package itmo.java.basics.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithms {

    public static void oddNumbers() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static void dividedByThreeAndFive() {
        StringBuilder divided3 = new StringBuilder("Делится на 3: ");
        StringBuilder divided5 = new StringBuilder("Делится на 5: ");
        StringBuilder divided35 = new StringBuilder("Делится на 3 и на 5: ");

        for (int i = 1; i < 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                divided35.append(i).append(" ");
            } else if (i % 3 == 0) {
                divided3.append(i).append(" ");
            } else if (i % 5 == 0) {
                divided5.append(i).append(" ");
            }
        }

        System.out.println(divided3);
        System.out.println(divided5);
        System.out.println(divided35);
    }

    public static void compareNumbers(int a, int b, int c) {
        boolean isBigger = false;
        System.out.println("Введите первое число:" + a);
        System.out.println("Введите второе число:" + b);
        System.out.println("Введите третье число:" + c);

        if ((b > a) && (c > b)) {
            isBigger = true;
        }
        System.out.println("Результат вывода: " + isBigger);
    }

    public static boolean containsThree(int[] array) {
        return (array[0] == 3) || (array[array.length - 1] == 3);
    }

    public static boolean containsOneOrThree(int[] array) {
        for (int i : array) {
            if ((i == 1) || (i == 3)) {return true;}
        }
        return false;
    }

    public static String ascendedOrderOrNot (int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            if (array[i] < array[i-1]) { return "Please, try again";}
        }
        return "OK";
    }

    public static void buildArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length:");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Numbers of array:");
        for (int i = 0; i < array.length; i++) {
            int a = scanner.nextInt();
            array[i] = a;
        }
        System.out.println("Result: " + Arrays.toString(array));
    }

    public static void swap(int[] array) {
        System.out.println("Array 1: " + Arrays.toString(array));
        int place = array[0];
        array[0] = array[array.length -1 ];
        array[array.length -1 ] = place;
        System.out.println("Array 2: " + Arrays.toString(array));
    }

    public static Integer uniqueNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int n = 0; n < array.length; n++) {
                if (array[i] == array[n]) {
                    count++;
                }
            }
            if (count == 1) {
                return array[i];
            }
        }
        return null;
    }

    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }

        int middle = array.length / 2;
        int[] left = new int[middle];
        int[] right = new int[array.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }
        for (int i = middle; i < array.length; i++) {
            right[i - middle] = array[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    public static void merge (int[] array, int[] left, int[] right) {
        int i = 0;
        int l = 0;
        int r = 0;

        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                array[i] = left[l];
                i++;
                l++;
            } else {
                array[i] = right[r];
                i++;
                r++;
            }
        }

        while (l < left.length) {
            array[i] = left[l];
            i++;
            l++;
        }

        while (r < right.length) {
            array[i] = right[r];
            i++;
            r++;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 3, 8, 7, 1, 9};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
