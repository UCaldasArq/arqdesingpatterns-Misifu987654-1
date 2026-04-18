package edu.ucaldas.behaviour.observer;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println("Notificando a " + name + ": el nuevo precio de la acción es " + price);
    }
}
