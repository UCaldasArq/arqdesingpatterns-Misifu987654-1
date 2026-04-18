package edu.ucaldas.estructurales.decorator;

public abstract class ProductDecorator implements Product {
    protected Product product;

    public ProductDecorator(Product product) {
        this.product = product;
    }

    @Override
    public double getPrice() {
        return product.getPrice(); // Delega al producto interno
    }

    @Override
    public String getDescription() {
        return product.getDescription(); // Delega al producto interno
    }
}