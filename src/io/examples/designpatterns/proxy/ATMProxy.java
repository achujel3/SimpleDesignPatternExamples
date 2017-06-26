package io.examples.designpatterns.proxy;

public class ATMProxy implements GetATMData {

    /**
     * Allows the user to access getATMState in the Object ATMMachine
     *
     * @return
     */
    @Override
    public ATMState getATMState() {

        ATMMachine realATMMachine = new ATMMachine();

        return realATMMachine.getATMState();

    }

    /**
     * Allows the user to access getCashInMachine in the Object ATMMachine
     *
     * @return
     */
    @Override
    public int getCashInMachine() {

        ATMMachine realATMMachine = new ATMMachine();

        return realATMMachine.getCashInMachine();

    }

}
