package ru.geekbrains.cat.and.dog;

public class Dog extends Animal {
    public Dog(String name, String type, int run, int jump, int swim) {
        super("Tore", 25, 5, 30);
    }

    public Dog() {

    }

    public void dogInfo(){
         System.out.println("Tore" + "run :" + 25 +"m" + "jump :" + 5 + "cm" + "swim :" + 40 + "m");
     }

}
