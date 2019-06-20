package ua.com.collections.collection.and.iterator;
//Если класс наследуется от другого класаа наследование ешё и от
//AbstractCollection  невозможно проше ограничиться наследованием
//идбавить возможность создания итератора

import ua.com.collections.List.Pet;
import ua.com.collections.List.Pets;

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}
