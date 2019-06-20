package ua.com.collections.cardexample;
// Чтобы сохранить информацию о владельцах сразу нескольких домашних животных
// Достаточно создать контейнер Map<Person, List<Pet>>()

import ua.com.collections.List.*;

import java.util.*;

public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPeople = new HashMap<>();

    static {
        petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"),
                new Mutt("Spot")));

        petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Shackleton"),
                new Cat("Elsie My"),
                new Dog("Margrett")));

        petPeople.put(new Person("Marilyn"), Arrays.asList(new Pug("Lui"),
                new Cat("Stan"),
                new Cat("Pinkola")));

        petPeople.put(new Person("Luke"), Arrays.asList(new Rat("Fuzzi"),
                new Rat("Fizzi")));

        petPeople.put(new Person("Isaac"), Arrays.asList(new Rat("Frecly")));
    }

    public static void main(String[] args){
        System.out.println("People: " + petPeople.keySet());
        System.out.println("Pets: " + petPeople.values());
        for(Person person : petPeople.keySet()){
            System.out.println(person + " has ");
            for(Pet pet : petPeople.get(person)){
                System.out.println("  " + pet);
            }
        }
    }
}
