package ua.com.collections.collection.and.iterator;

// Реализация Collection акже означает поддержку метода iterator

import ua.com.collections.List.Pet;
import ua.com.collections.List.Pets;

import java.util.*;

public class InterfaceVsIterator {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + " " + p + " ");
        }
        System.out.println();
    }

    public static void display(Collection<Pet> pets) {
        pets.stream().map(p -> p.id() + " " + p + " ").forEach(System.out::println);
//        for (Pet p : pets) {
//            System.out.print(p.id() + " " + p + " ");
//
//        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> petList = Pets.arrayList(8);
        Set<Pet> petSet = new HashSet<>(petList);
        Map<String, Pet> petMap = new LinkedHashMap<>();
        String[] names = ("Ralph,Eric,Robin,Lacey,Britney,Sam,Spot, Fluffu").split(". ");
        for (int i = 0; i < names.length; i++) {
            petMap.put(names[i], petList.get(i));
        }
        display(petList);
        display(petSet);
        display(petList.iterator());
        display(petSet.iterator());
        System.out.println(petMap);
        System.out.println(petMap.keySet());
        display(petMap.values());
        display(petMap.values().iterator());
    }
}
