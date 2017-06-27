package io.examples.designpatterns.chainOfResponsibility;

public class AddNumbers implements Chain {

    private Chain nextInChain;

    /**
     * Defines the next Object to receive the data if this one can't use it
     *
     * @param nextChain
     */
    @Override
    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    /**
     * Tries to calculate the data, or passes it to the Object defined in method setNextChain()
     *
     * @param request
     */
    @Override
    public void calculate(Numbers request) {

        if (request.getCalcWanted() == "add") {

            System.out.println(request.getNumber1() + " + " + request.getNumber2() +
                    " = " + (request.getNumber1() + request.getNumber2()));

        } else {

            nextInChain.calculate(request);

        }

    }

}
