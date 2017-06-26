package io.examples.designpatterns.proxy;

public interface ATMState {

    /**
     * Different states expected
     *
     * HasCard, NoCard, HasPin, NoCash
     */

    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);

}
