package ru.geekbrains.cat.and.dog;

public class Marathon {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Cat cat = new Cat();
        animal1.animalInfo();
        cat.catInfo();

        Animal animal2 = new Animal();
        Dog dog = new Dog();
        animal2.animalInfo();
        dog.dogInfo();


    }
}
