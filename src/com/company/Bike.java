package com.company;

public class Bike implements Drivable, saleable {
    public Human owner;


    @Override
    public void drive(Double distance) {
        System.out.println("great trip");
    }

    @Override
    public boolean hasDriver() {
        return true;
    }

    @Override
    public Double getVelocity() {
        return 0.0;
    }

    @Override
    public Double getPrice() {
        //połączenie do swiatowej giełdy rowerów
        //uwzględnienie stanu roweru
        return 1287.40;
    }

    @Override
    public Human getOwner() {
        return this.owner;
    }

    @Override
    public void sell(Human buyer) throws Exception {
        if(buyer.cash < this.getPrice()){
            throw new Exception("nie masz środków");
        } else {
            this.owner.cash += this.getPrice();
            buyer.cash -= this.getPrice();
            this.owner = buyer;
        }
    }
}
