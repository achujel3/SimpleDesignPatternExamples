package io.examples.designpatterns.abstractfactory;

public abstract class EnemyShip {

    private String name;

    protected ESWeapon weapon;
    protected ESEngine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void makeShip();

    public void followHeroShip() {
        System.out.println(getName() + " is following the hero at " + engine);
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + weapon);
    }

    @Override
    public String toString() {
        return "EnemyShip{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", engine=" + engine +
                '}';
    }
}
