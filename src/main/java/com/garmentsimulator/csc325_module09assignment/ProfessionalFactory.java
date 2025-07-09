package com.garmentsimulator.csc325_module09assignment;
//Generates a family of products of the professional variant

public class ProfessionalFactory implements GarmentFactory {

    public Top createTop() {
        return new ProfessionalTop();
    }

    public Pants createPants() {
        return new ProfessionalPants();
    }

    public Shoes createShoes() {
        return new ProfessionalShoes();
    }

}
