package itmo.java.basics.lab9;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class User {
    private String name;

    public User (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void getPoints(Map<User, Integer> players) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя игрока");
        User expectedPlayer = new User(scanner.next());
        if (players.containsKey(expectedPlayer)) {
            System.out.println("Количество очков: " + players.get(expectedPlayer));
        } else {
            System.out.println("Игрок не найден!");
        }
    }

    public static void main(String[] args) {
        Map<User, Integer> players = new HashMap<>();

        players.put(new User ("John"), 41343);
        players.put(new User ("Alice"), 389343);
        players.put(new User ("Katie"), 389343);
        players.put(new User ("Bob"), 671343);
        players.put(new User ("Mike"), 389343);

        getPoints(players);
    }
}
