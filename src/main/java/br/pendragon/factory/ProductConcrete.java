package br.pendragon.factory;

public class ProductConcrete implements Product{
    @Override
    public void create() {
        System.out.println("Creating concrete product");
    }
}
