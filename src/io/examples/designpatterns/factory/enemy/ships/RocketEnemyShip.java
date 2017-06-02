package io.examples.designpatterns.factory.enemy.ships;

import io.examples.designpatterns.factory.enemy.EnemyShip;

public class RocketEnemyShip extends EnemyShip {

    public RocketEnemyShip() {

        setName("Rocket Enemy ship");
        setAmtDamage(10.0);

    }
}
