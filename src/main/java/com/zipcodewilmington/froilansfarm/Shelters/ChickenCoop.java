package com.zipcodewilmington.froilansfarm.Shelters;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;

public class ChickenCoop extends Shelter{
    private Shelter<Chicken> chickenCoop = new Shelter();

    public void Chicken(){
        this.numOfChickens = new ArrayList<>();
    }

    public ArrayList<Chicken> getNumOfChickens(){
        return numOfChickens;
    }

    public void addChicken(){
        Chicken chicken = new Chicken();
        numOfChickens.add(chicken);
    }

}
