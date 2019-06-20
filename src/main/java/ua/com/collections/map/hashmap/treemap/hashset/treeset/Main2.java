package ua.com.collections.map.hashmap.treemap.hashset.treeset;

import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Map<User, Account> debts = new MyMap<>();

        System.out.println("Наши должники");

        User stiven = new User("Stiven Pupkin");
        User eva = new User("Eva Pupkina");
        User bob = new User("Bob Marley");

        debts.put(stiven, new Account(30));
        debts.put(eva, new Account(305));
        debts.put(bob, new Account(305));

        System.out.println();
        //...
        System.out.println("Проверка связи");
        System.out.println("Stiven pupkin: " + debts.get(stiven));

        System.out.println("Eva Pupkina: " + debts.get(eva));

        System.out.println("Bob Marley: " + debts.get(bob));
        System.out.println();

        // Bob Marley -300 income
        System.out.println("Погашение долга Bob Marley");
        debts.get(bob).income(-300);

        //...

        System.out.println(debts.toString() + "\n");

        // Проитерироваться по всему Map<>
        System.out.println("Проитерироваться по всей Мапе");

        for (Map.Entry<User, Account> entry : debts.entrySet()) {
            System.out.println(entry.toString());
        }
        System.out.println();

        // Проитерироваться по всему Map<>
        System.out.println("Проитерироваться по всей Мапе и отнять по 5 ");
        for (Map.Entry<User, Account> entry : debts.entrySet()) {
            entry.getValue().income(-5);
            System.out.println(entry.toString());
        }
        System.out.println();

        // Удалить по ключу
        System.out.println("Удаление по ключу");
        if (debts.get(bob).getAmount() == 0) {
            debts.remove(new User("Bob Marley"));
            System.out.println(debts.toString());
        }
        System.out.println();

        // Проверить есть ли данный ключ
        System.out.println("Проверить есть ли данный ключ");
        System.out.println("Bob Marley exists = " + debts.containsKey(bob));
        System.out.println();

        //Проверка есть ли данный элемент по значению
        System.out.println("Проверка есть ли данный элемент по значению");
        System.out.println("300$ = " + debts.containsValue(new Account(300)));

    }
}
