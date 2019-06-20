package ua.com.collections.LinkedList;
// Демонстрация схожих и отличающихся аспектов методов LinkedList

import ua.com.collections.List.Hamster;
import ua.com.collections.List.Pet;
import ua.com.collections.List.Pets;
import ua.com.collections.List.Rat;

import java.util.LinkedList;

public class LinkedListFeature {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        System.out.print(pets);

        // Идентично
        // Возвращает первый элемент из списка без удаления
        System.out.print("1 : pets.getFirst(): " + pets.getFirst() + "\n");
        System.out.print("2 : pets.element(): " + pets.element() + "\n");

        // Различие появляется только для пустых списков возвращает null дляпустого списка
        // Возвращает первый элемент из списка без удаления
        System.out.print("3 : pets,peek(): " + pets.peek() + "\n");

        // Идентично удаление и возврат первого элемента
        System.out.print("pets.remove(): " + pets.remove() + "\n");
        System.out.print("4 : " + pets + "\n");
        System.out.print("pets.removeFirst(): " + pets.removeFirst() + "\n");
        System.out.print("5 : " + pets + "\n");

        // Различие проявляется только для пустых списков
        System.out.print("pets.poll(): " + pets.poll() + "\n");
        System.out.print("6 : " + pets + "\n");

        //Вставка элемента в начало списка
        pets.addFirst(new Rat());
        System.out.print("After addFirst(): " +  "\n");
        System.out.print("7 : " + pets + "\n");

        //  этот метод добавляет указанный элемент в качестве хвоста
        //  (последнего элемента) этого списка.
        pets.offer(Pets.randomPet());
        System.out.print("8: After offer: " + pets + "\n");

        // метод add() добавляет указаный элемент в конец списка
        pets.add(Pets.randomPet());
        System.out.print("9: After add(): " + pets + "\n");

        // етод addLast() добавляет указаный элемент в конец списка
        pets.addLast(new Hamster());
        System.out.print("10: After addLast: " + pets + "\n");
        System.out.print("11 : " + pets.removeLast());
        System.out.print("12 : " + pets);
    }
}
