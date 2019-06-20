package ua.com.collections.collection.and.iterator;
//Если класс наследуется от другого класаа наследование ешё и от
//AbstractCollection  невозможно проше ограничиться наследованием
//идбавить возможность создания итератора

import ua.com.collections.List.Pet;

import java.util.Iterator;

public class NonCollectionSequence extends PetSequence {

    public Iterator<Pet> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;

            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            public void remove() {
                //не реализован
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }
}
