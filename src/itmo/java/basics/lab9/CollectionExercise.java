package itmo.java.basics.lab9;
import javax.print.attribute.IntegerSyntax;
import java.util.*;

import static java.lang.System.currentTimeMillis;

public class CollectionExercise {

    public static <T> Collection<T> removeDuplicates (Collection<T> collection) {
        Set<T> uniqueCollection = new HashSet<>(collection);
        return uniqueCollection;
    }

    public static void addElements (List<Integer> list, int amount) {
        long startTime = currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            list.add(i);
        }
        long endTime = currentTimeMillis();
        System.out.println("Время выполнения операции addElements: " + (endTime - startTime));
    }

    public static void randomElement(List<Integer> list, int amount) {
        long startTime = currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
           list.get(random.nextInt(list.size()));
        }
        long endTime = currentTimeMillis();
        System.out.println("Время выполнения операции randomElement: " + (endTime - startTime));
    }

    public static void main(String[] args) {
        ArrayList <Integer> arraylist = new ArrayList<>();
        LinkedList <Integer> linkedlist = new LinkedList<>();

        addElements(arraylist, 1_000_000);
        addElements(linkedlist, 1_000_000);

        randomElement(arraylist, 100_000);
        randomElement(linkedlist, 100_000);

    }
}
