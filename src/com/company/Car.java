package com.company;

public abstract class Car implements Drivable, saleable{
    final String producer;
    final String model;
    final Integer yearOfProduction;
    Double millage;

    public Human owner;
    public Car(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.millage = 0.0;
    }



    public void drive(Double distance){
        this.millage += distance;
    }

    public boolean hasDriver(){
        //here should be some logic
        return true;
    }

    public Double getVelocity(){
        //here should be some more code
        return 0.0;
    }

    public String toString(){
        return "Producer: " + this.producer +" model: "+ this.model;
    }

    abstract public Double getCleaningPrice();
    abstract public void changeWheels();

    @Override
    public Double getPrice() {
        //połączenie do swiatowej giełdy rowerów
        //uwzględnienie stanu roweru
        return 12687.40;
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
