package ua.com.collections.map.hashmap.treemap.hashset.treeset;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main3 {

    static class Account {
        private int amount;

        public Account(int amount) {
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }

        public void income(int amount) {
            this.amount += amount;
        }

        @Override
        public String toString() {
            return "" + amount + '$';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null) return false;
            if (!(o instanceof Account)) return false;
            Account a = (Account) o;
            return a.amount == amount;
        }

        @Override
        public int hashCode() {
            return Integer.valueOf(amount).hashCode();
        }
    }

    public static class User implements Comparable<User> {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public int compareTo(User o) {
            return name.compareTo(o.name);
        }
    }

    public static void main(String[] args) {
        Map<User, Account> debts = new LinkedHashMap<>();
//        Map<User, Account> debts = new TreeMap<>(new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        // ...
        System.out.println("*** Наши должники");

        User stiven = new User("Stiven Pupkin");
        User eva = new User("Eva Pupkina");
        User bob = new User("Bob Marley");

        debts.put(stiven, new Account(30));
        debts.put(eva, new Account(305));
        debts.put(bob, new Account(305));

        // ...

        System.out.println("Stiven Pupkin = " + debts.get(stiven));

        System.out.println("Eva Pupkina = " + debts.get(eva));

        System.out.println("Bob Marley = " + debts.get(bob));

        // ...
        System.out.println("*** Bob Marley -300 income");

        debts.get(bob).income(-300);

        // ...

        System.out.println(debts.toString());

        // ...
        System.out.println("*** Акция Итератор!");

        for (Map.Entry<User, Account> entry : debts.entrySet()) {
            entry.getValue().income(-5);
            System.out.println(entry.toString());
        }

        // ...
        System.out.println("*** Удаление !должников");

        if (debts.get(bob).getAmount() == 0) {
            debts.remove(new User("Bob Marley"));
        }

        System.out.println(debts.toString());

        // ...
        System.out.println("*** Bob Marley exists = " + debts.containsKey(bob));

        // ...
        System.out.println("*** -25$ exists = " + debts.containsValue(new Account(-25)));
    }
}
