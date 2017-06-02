package io.examples.designpatterns.factory.enemy;

import io.examples.designpatterns.factory.enemy.ships.BigUFOEnemyShip;
import io.examples.designpatterns.factory.enemy.ships.RocketEnemyShip;
import io.examples.designpatterns.factory.enemy.ships.UFOEnemyShip;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip newShip = null;

        switch (newShipType) {
            case "U":
                return new UFOEnemyShip();
            case "R":
                return new RocketEnemyShip();
            case "B":
                return new BigUFOEnemyShip();
            default:
                return null;
        }


    }

}
