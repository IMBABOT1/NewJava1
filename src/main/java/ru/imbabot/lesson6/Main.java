package ru.imbabot.lesson6;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(cat.run(100));
        System.out.println(cat.swim(1));

        System.out.println(dog.swim(11));
    }
}
