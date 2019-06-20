package ua.com.collections.foreach.and.iterator;
// ьногие классы реализуют Iterable
// прежде всего Collection
// Но не Map

import java.util.Map;

public class EnveronmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue());
        }
    }
}
