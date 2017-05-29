package io.examples.designpatterns.strategy;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(dog.getFlys().fly());
        System.out.println(bird.getFlys().fly());
        dog.setFlys(new ItFlys());
        System.out.println(dog.getFlys().fly());
    }

}
