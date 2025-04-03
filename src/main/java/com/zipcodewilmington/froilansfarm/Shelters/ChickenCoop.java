package com.zipcodewilmington.froilansfarm.Shelters;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;

public class ChickenCoop extends Shelter{
    public static ArrayList<Chicken> numOfChickens = new ArrayList<Chicken>(15);

    public void Chicken(){
        this.numOfChickens = new ArrayList<>();
    }

    public ArrayList<Chicken> getNumOfChickens(){
        return numOfChickens;
    }

    public void addChicken(Chicken chicken){
        numOfChickens.add(chicken);
    }

}
