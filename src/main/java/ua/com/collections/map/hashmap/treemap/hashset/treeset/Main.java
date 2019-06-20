package ua.com.collections.map.hashmap.treemap.hashset.treeset;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Account> debts = new HashMap<>();
        System.out.println("Наши должники");
        debts.put("Stiven Pupkin", new Account(30));
        debts.put("Eva Pupkina", new Account(305));
        debts.put("Bob Marley", new Account(305));
        System.out.println();
        //...
        System.out.println("Проверка связи");
        System.out.println("Stiven pupkin: " + debts.get("Stiven Pupkin"));

        System.out.println("Eva Pupkina: " + debts.get("Eva Pupkina"));

        System.out.println("Bob Marley: " + debts.get("Bob Marley"));
        System.out.println();

        // Bob Marley -300 income
        System.out.println("Погашение долга Bob Marley");
        debts.get("Bob Marley").income(-300);

        //...

        System.out.println(debts.toString() + "\n");

        // Проитерироваться по всему Map<>
        System.out.println("Проитерироваться по всей Мапе");

        for (Map.Entry<String, Account> entry : debts.entrySet()) {
            System.out.println(entry.toString());
        }
        System.out.println();

        // Проитерироваться по всему Map<>
        System.out.println("Проитерироваться по всей Мапе и отнять по 5 ");
        for (Map.Entry<String, Account> entry : debts.entrySet()) {
            entry.getValue().income(-5);
            System.out.println(entry.toString());
        }
        System.out.println();

        // Удалить по ключу
        System.out.println("Удаление по ключу");
        if (debts.get("Bob Marley").getAmount() == 0) {
            debts.remove("Bob Marley");
            System.out.println(debts.toString());
        }
        System.out.println();

        // Проверить есть ли данный ключ
        System.out.println("Проверить есть ли данный ключ");
        System.out.println("Bob Marley exists = " + debts.containsKey("Bob Marley"));
        System.out.println();

        //Проверка есть ли данный элемент по значению
        System.out.println("Проверка есть ли данный элемент по значению");
        System.out.println("300$ = " + debts.containsValue(new Account(300)));
    }
}
