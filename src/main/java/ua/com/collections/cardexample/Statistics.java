package ua.com.collections.cardexample;
// Ключом является число сгенерированое при помощи Random
// а значением количество его вхождений
// Пример использования HashMap

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
    public static void main(String[] args){
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            // Получение случайного числа от 0 до 20
            int a = rand.nextInt(20);
            Integer fred = m.get(a);
            m.put(a,fred == null ? 1 : fred + 1);
        }
        System.out.println(m);
    }
}
