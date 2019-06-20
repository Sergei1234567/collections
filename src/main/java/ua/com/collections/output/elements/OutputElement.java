package ua.com.collections.output.elements;

import java.util.ArrayList;
import java.util.Collection;

public class OutputElement {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
//Вывод элементов в порядке убывания
        for (int i = c.size() - 1; i >= 0; i--) {
            System.out.print(i + ",");
        }

        System.out.println();

//Вывод элементов впорядке возврастания
        for (int i = 0; i < c.size(); i++) {
            System.out.print(i + ",");
        }
    }
}
