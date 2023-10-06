package br.pendragon.factory;

public class ProductFactory extends Creator{
    @Override
    protected Product createProduct() {
        return new ProductConcrete();
    }
}
