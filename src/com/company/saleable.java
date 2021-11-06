package com.company;

public interface saleable {
    Double getPrice();
    Human getOwner();
    void sell(Human buyer) throws Exception;



}
