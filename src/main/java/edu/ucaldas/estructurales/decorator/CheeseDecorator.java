package edu.ucaldas.estructurales.decorator;

public class CheeseDecorator implements Product {
    private Product baseProduct;

    public CheeseDecorator(Product baseProduct) {
        this.baseProduct = baseProduct;
    }

    @Override
    public double getPrice() {
        return baseProduct.getPrice() + 2.5; 
    }

    @Override
    public String getDescription() {
        return baseProduct.getDescription() + " + Queso";
    }

    @Override
    public double getCost() {
        return getPrice();
    }
}
