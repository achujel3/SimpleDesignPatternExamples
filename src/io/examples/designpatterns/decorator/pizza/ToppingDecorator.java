package io.examples.designpatterns.decorator.pizza;

/**
 * Has a "Has" relationship with Pizza. This is an Aggregation Relatioship
 */
public class ToppingDecorator implements Pizza{

    protected Pizza tempPizza;

    /**
     * Assigns the type instance to this attribute of Pizza
     *
     * All decorators can dynamically customize the Pizza instance PlainPizza because of this
     *
     * @param tempPizza
     */
    public ToppingDecorator(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
