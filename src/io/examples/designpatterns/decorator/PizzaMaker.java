package io.examples.designpatterns.decorator;

import io.examples.designpatterns.decorator.pizza.ingredients.Mozzarella;
import io.examples.designpatterns.decorator.pizza.Pizza;
import io.examples.designpatterns.decorator.pizza.PlainPizza;
import io.examples.designpatterns.decorator.pizza.ingredients.TomatoSauce;

public class PizzaMaker {

    public static void main(String[] args) {

        // The PlainPizza object is sent to the Mozzarella constructor and then to the TomatoSauce constructor

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());

        System.out.println("Price: " + basicPizza.getCost());

    }

}
