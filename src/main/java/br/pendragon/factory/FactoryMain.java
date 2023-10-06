package br.pendragon.factory;

public class FactoryMain {
    public static void main(String[] args){

        ProductFactory productFactory = new ProductFactory();
        Product p = productFactory.create();

    }

}
