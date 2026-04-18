package edu.ucaldas.behaviour.observer;

public class TestObserver {
    public static void main(String[] args) {

        Stock stock = new Stock();

        Investor nico = new Investor("Nico");
        Investor ana = new Investor("Ana");

        stock.addObserver(nico);
        stock.addObserver(ana);

        stock.setPrice(150.0);
        stock.setPrice(200.0);
    }
}
