package com.garmentsimulator.csc325_module09assignment;

public class CasualFactory implements GarmentFactory {

    public Top createTop() {
        return new CasualTop();
    }

    public Pants createPants() {
        return new CasualPants();
    }

    public Shoes createShoes() {
        return new CasualShoes();
    }
}
