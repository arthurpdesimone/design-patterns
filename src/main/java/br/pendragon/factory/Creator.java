package br.pendragon.factory;

public abstract class Creator {

    public Product create() {
        Product vehicle = createProduct();
        vehicle.create();
        return vehicle;
    }
    protected abstract Product createProduct();

}
