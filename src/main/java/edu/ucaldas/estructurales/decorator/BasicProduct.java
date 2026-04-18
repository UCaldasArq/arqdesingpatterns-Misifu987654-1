package edu.ucaldas.estructurales.decorator;

public class BasicProduct implements Product {
    @Override
    public double getPrice() {
        return 10.0; // precio base
    }

    @Override
    public String getDescription() {
        return "Producto básico";
    }

    @Override
    public double getCost() {
        return getPrice(); 
    }
}
