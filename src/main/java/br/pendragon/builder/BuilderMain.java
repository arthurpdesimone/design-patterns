package br.pendragon.builder;



public class BuilderMain {
    public static void main(String[] args){
        BuilderConcrete builderConcrete = new BuilderConcrete();
        builderConcrete.setString("s");
        builderConcrete.setDouble(2d);
        builderConcrete.setInteger(1);

        ObjectConcrete objectConcrete = builderConcrete.build();

    }

}
