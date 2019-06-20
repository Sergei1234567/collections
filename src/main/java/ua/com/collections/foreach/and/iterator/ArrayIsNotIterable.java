package ua.com.collections.foreach.and.iterator;
// foreach работает с массивами и всем что поддерживает Iterable
// но это не значит что массив автоматически поддерживает Iterable
// автоматическое преобразование Iterable не производиться
// его необходимо выполнять вручную

import java.util.Arrays;

public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for (T t : ib) {
            System.out.print(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
        // Массив работает в foreach но не являеться Iterable
        // ! test(strings);
        // его необходимо явно преобразовать к Iterable
        test(Arrays.asList(strings));
    }
}
