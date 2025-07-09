package com.garmentsimulator.csc325_module09assignment;

//interface for creating tops, implemented by each variant factory class
public interface GarmentFactory {

    Top createTop();
    Shoes createShoes();
    Pants createPants();

}
