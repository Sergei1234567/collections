package ua.com.collections.Iterators;
//Итератор в действии

import ua.com.collections.List.Pet;
import ua.com.collections.List.Pets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> it = pets.iterator();
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.println(p.id() + " : " + p);
        }
        System.out.println();

        //Более простой способ

        for (Pet p : pets) {
            System.out.println(p.id() + " : " + p);
        }
        System.out.println();

        //Итератор также способен удалять элементы

        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            it.next();
            it.remove();

        }
        System.out.println(pets);
        List<Pet> copy = new ArrayList<>(pets);
            System.out.print(copy);

        System.out.println();

        copy.remove(1);
        System.out.println(copy);
    }
}
