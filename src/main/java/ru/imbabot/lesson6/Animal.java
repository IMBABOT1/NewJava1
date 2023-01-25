package ru.imbabot.lesson6;

public class Animal {

    private float runDistance;
    private float jumpHeight;

    public Animal(float runDistance, float jumpHeight) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public boolean run(float distance) {
        return runDistance >= distance;
    }

    public boolean jump(float height) {
        return jumpHeight >= height;
    }

}
