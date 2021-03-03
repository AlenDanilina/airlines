package ru.devay.airport;

public class Baggage {
    Airlines airlines;
    String airClass;
    int maxWeight;


    public int getMaxWeight() {
        return maxWeight;
    }

    public int getMaxLeight(){
        return airClass.length () + airClass.length ();
    }

    @Override
    public String toString() {
        return "Baggage{" +
                "airlines=" + airlines +
                ", airClass='" + airClass + '\'' +
                ", maxWeight=" + maxWeight +
                '}';
    }

    public Baggage(Airlines airlines, String airClass, int maxWeight) {
        this.airlines = airlines;
        this.airClass = airClass;
        this.maxWeight = maxWeight;


    }
}