package ru.geekbrains.cat.and.dog;

public class Cat extends Animal {
    public Cat(String name, int run, int jump, int swim) {
        super("Musya", 50, 10,15 );

    }

    public Cat() {

    }

    public void catInfo(){
        System.out.println("Musya " + "run:" + 50 + " m" + "jump:" + 10 + "  cm" + "swim :" + 20 + "m");

    }
}