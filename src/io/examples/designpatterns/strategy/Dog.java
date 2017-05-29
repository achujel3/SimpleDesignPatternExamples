package io.examples.designpatterns.strategy;

public class Dog extends Animal {

    public void digHole() {
        System.out.println("Digging hole.");
    }

    public Dog() {
        super();
        setSound("Bark");
        setFlys(new CantFly());
    }

}
