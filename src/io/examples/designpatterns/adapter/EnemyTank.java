package io.examples.designpatterns.adapter;

import java.util.Random;

/**
 * EnemyTank implements EnemyAttacker perfectly
 * <p>
 * Our job is to make classes with different methods from EnemyAttacker to work with the EnemyAttacker interface
 */
public class EnemyTank implements EnemyAttacker {

    private Random generator = new Random();

    @Override
    public void fireWeapon() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Tank Does " + attackDamage + " Damage");
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Tank moves " + movement + " spaces");
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");
    }

}
