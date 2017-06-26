package io.examples.designpatterns.state;

public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine newAtmMachine) {
        atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please enter your PIN");
        atmMachine.setATMState(atmMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("You didn't enter a card");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("You have entered your card");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("You have not entered your card");
    }
}
