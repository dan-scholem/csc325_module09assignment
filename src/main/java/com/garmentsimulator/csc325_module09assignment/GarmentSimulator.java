package com.garmentsimulator.csc325_module09assignment;

public class GarmentSimulator {

    private Top top;
    private Pants pants;
    private Shoes shoes;

    public GarmentSimulator(GarmentFactory factory){
        this.top = factory.createTop();
        this.pants = factory.createPants();
        this.shoes = factory.createShoes();
    }

    public Top getTop() {
        return top;
    }

    public void setTop(Top top) {
        this.top = top;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public boolean testFamilyMatch(Top top, Pants pants, Shoes shoes){
        return top.getVariant().equals(pants.getVariant()) && pants.getVariant().equals(shoes.getVariant());
    }

}
