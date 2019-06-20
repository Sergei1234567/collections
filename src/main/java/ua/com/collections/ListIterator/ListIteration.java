package ua.com.collections.ListIterator;
// ListIterator - Разновидность - Iterator - поддержуется только классами List

import ua.com.collections.List.Pet;
import ua.com.collections.List.Pets;

import java.util.List;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        // Метод - previousIndex() - метод используется для возврата индекса данного элемента,
        // который возвращается при вызове предыдущего. Метод может вернуть -1 в том и только в том случае,
        // если итератор находится в начале списка.
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p + ", " + it.nextIndex() + ", " + it.previousIndex() + ": ");
        }
        System.out.println();

        // В щбратном порядке

        while (it.hasPrevious()) {
            Pet p = it.previous();
            System.out.print(p.id() + ": " + p + ",");
        }
        System.out.println();

        // Метод Pets.RandomPet() используется для замены всех обьектов Pet в списке с
        // позиции 3 и далее
        System.out.println(pets);
        it = pets.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);

    }
}
