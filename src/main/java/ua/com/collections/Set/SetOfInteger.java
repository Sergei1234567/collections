package ua.com.collections.Set;
// Пример использования HashSet с обьектами Integer

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            intset.add(rand.nextInt(50));
        }
        System.out.println(intset);

    // Чтобы результат был отсортирован воспользуйтесь TreeSet вместо HashSet
        rand = new Random(47);
        intset = new TreeSet<>();
        for (int i = 0; i < 1000; i++) {
            intset.add(rand.nextInt(50));
        }
        System.out.println(intset);
    }
}
