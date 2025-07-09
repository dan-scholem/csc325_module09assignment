package com.garmentsimulator.csc325_module09assignment;
//Generates a family of products of the party variant

public class PartyFactory implements GarmentFactory{

    public Top createTop() {
        return new PartyTop();
    }

    public Pants createPants() {
        return new PartyPants();
    }

    public Shoes createShoes() {
        return new PartyShoes();
    }

}
