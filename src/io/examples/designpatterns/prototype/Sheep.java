package io.examples.designpatterns.prototype;

public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep is Made!");
    }

    @Override
    public Animal makeCopy() {

        System.out.println("Sheep is Beeing made");

        Sheep sheepObject = null;

        try {

            // Calls the Animal super classes clone()
            // Then casts the results to Sheep

            sheepObject = (Sheep) super.clone();

        } catch (CloneNotSupportedException e) {

            System.out.println("The Sheep was turned to Mush");

            e.printStackTrace();
        }

        return sheepObject;
    }

    @Override
    public String toString() {
        return "Dolly is my hero, baaaaaa!";
    }
}
