package com.garmentsimulator.csc325_module09assignment;

public class GarmentSimulatorDriver {

    public static void main(String[] args) {

        CasualFactory casual = new CasualFactory();
        PartyFactory party = new PartyFactory();
        ProfessionalFactory professional = new ProfessionalFactory();

        GarmentSimulator casualFamily = new GarmentSimulator(casual);
        GarmentSimulator partyFamily = new GarmentSimulator(party);
        GarmentSimulator professionalFamily = new GarmentSimulator(professional);



        if(casualFamily.testFamilyMatch(casualFamily.getTop(), casualFamily.getPants(), casualFamily.getShoes())){
            System.out.println("Casual: Top, Pants, and Shoes are the same family");
        }

        if(partyFamily.testFamilyMatch(partyFamily.getTop(), partyFamily.getPants(), partyFamily.getShoes())){
            System.out.println("Party: Top, Pants, and Shoes are the same family");
        }

        if(professionalFamily.testFamilyMatch(professionalFamily.getTop(), professionalFamily.getPants(), professionalFamily.getShoes())){
            System.out.println("Professional: Top, Pants, and Shoes are the same family");
        }


    }

}
