package ru.geekbrains.cat.and.dog;

public class Animal {

    private String type;
    private String name;
    private int jump;
    private int swim;
    private   int run;

    public Animal(String name, int i, int i1, int i2){
    }
    public Animal(String name, String type, int run, int jump, int swim){
        this.name = name;
        this.type = type;
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }

    public Animal() {

    }

    public void animalInfo(){
        System.out.println();
    }


}
