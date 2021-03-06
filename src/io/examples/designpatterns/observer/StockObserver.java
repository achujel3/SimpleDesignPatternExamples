package io.examples.designpatterns.observer;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer " + this.observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = applPrice;
        this.googPrice = googPrice;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "StockObserver{" +
                "ibmPrice=" + ibmPrice +
                ", aaplPrice=" + aaplPrice +
                ", googPrice=" + googPrice +
                '}';
    }
}
