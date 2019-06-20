package ua.com.collections.adding.groups.of.elements;
//Добавление груп элементов
import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        System.out.println(collection);

        //Работает быстрее но таким способом
        //невозможно сконструировать Collection
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);

        //Создает список на ооснове массива
        List<Integer> list = Arrays.asList(16,17,18,19,20);
        System.out.println(list);

        //можно изменять элемент
        list.set(0, 99);
        System.out.println(list);

        //брать элемент по индексу
        System.out.println(list.get(3));
    }
}
