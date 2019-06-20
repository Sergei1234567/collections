package ua.com.collections.map.hashmap.treemap.hashset.treeset;

import java.util.*;

public class MyMap<K, V> extends AbstractMap<K, V> {

    private Set<Map.Entry<K, V>> entries = new HashSet<>();

    private static class EntryImpl<K, V> implements Entry<K, V> {

        private K key;
        private V value;

        public EntryImpl(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EntryImpl<?, ?> entry = (EntryImpl<?, ?>) o;
            return Objects.equals(key, entry.key) &&
                    Objects.equals(value, entry.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }

        @Override
        public String toString() {
            return "{" + key +
                    "=" + value +
                    '}';
        }
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return entries;
    }


    @Override
    public V put(K key, V value) {
        Map.Entry<K, V> newEntry = new EntryImpl<>(key, value);
        V oldVaiue = null;
        for (Map.Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                oldVaiue = entry.getValue();
            }
        }
        entries.add(newEntry);
        return oldVaiue;
    }
}
