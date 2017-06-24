package io.examples.designpatterns.adapter;

/**
 * The Adapter must provide an alternative action for the methods that need to be used because EnemyAttacker was
 * implemented.
 * <p>
 * This adapter does this by containing an object of the same type as the Adaptee (EnemyRobot)
 * <p>
 * All calls to EnemyAttacker methods are sent instead to methods by EnemyRobot
 */
public class EnemyRobotAdapter implements EnemyAttacker {

    private EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot) {
        theRobot = newRobot;
    }

    @Override
    public void fireWeapon() {
        theRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        theRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        theRobot.reactToHuman(driverName);
    }
}
