package io.examples.designpatterns.singleton;

public class ScrabbleTestThreads {

    public static void main(String[] args) {

        // Create a new Thread created using the Runnable interface
        // Execute the code in run after 10 seconds

        Runnable getTiles = new GetTheTiles();
        Runnable getTileAgain = new GetTheTiles();

        // Call for the code in the method run to execute

        new Thread(getTiles).run();
        new Thread(getTileAgain).run();

    }

}
