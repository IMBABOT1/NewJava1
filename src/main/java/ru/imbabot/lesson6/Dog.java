package ru.imbabot.lesson6;

import java.util.Random;

public class Dog extends Animal{

    private float swimDistance;

    public Dog() {
        super(500, 0.5f);
        this.swimDistance = 10;
    }

    public boolean swim(float distance){
        return swimDistance >= distance;
    }

}
