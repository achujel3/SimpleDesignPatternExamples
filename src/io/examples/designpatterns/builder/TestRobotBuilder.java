package io.examples.designpatterns.builder;

public class TestRobotBuilder {

    public static void main(String[] args) {

        // Get RobotBuilder of type OldRobotBuilder

        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        // Pass the OldRobotBuilder specification to the engineer

        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        // Tell the engineer to make the Robot using the specifications
        // of the OldRobotBuilder class

        robotEngineer.makeRobot();

        // The engineer returns the right robot based off the spec
        // sent to it on line 13

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println(firstRobot);

    }

}
