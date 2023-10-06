package br.pendragon.builder;

public class BuilderConcrete implements BuilderInterface{
    private String s;
    private Integer i;
    private Double d;

    @Override
    public void setString(String s) {
        this.s=s;
    }

    @Override
    public void setInteger(Integer i) {
        this.i=i;
    }

    @Override
    public void setDouble(Double d) {
        this.d=d;
    }

    public ObjectConcrete build(){
        return new ObjectConcrete(s,i,d);
    }
}
