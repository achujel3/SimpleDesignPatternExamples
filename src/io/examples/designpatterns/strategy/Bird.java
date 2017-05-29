package io.examples.designpatterns.strategy;

public class Bird extends Animal {

    public Bird() {
        super();
        setFlys(new ItFlys());
    }
}
