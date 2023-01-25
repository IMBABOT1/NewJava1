package ru.imbabot.lesson6;

public class Cat extends Animal{

    public Cat(){
        super(200 + (float) Math.random() * 400, 2.0f);
    }

    public boolean swim(float distance){
        System.out.println("Cat can't swim");
        return false;
    }
}
