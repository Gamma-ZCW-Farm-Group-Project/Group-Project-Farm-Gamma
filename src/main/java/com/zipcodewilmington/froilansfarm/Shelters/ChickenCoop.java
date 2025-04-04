package com.zipcodewilmington.froilansfarm.Shelters;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;

public class ChickenCoop extends Shelter{
    public static ArrayList<Chicken> numOfChickens = new ArrayList<>();

    public void Chicken(){
        numOfChickens = new ArrayList<>();
    }

//    public ArrayList<Chicken> getNumOfChickens(){
//        return numOfChickens;
//    }

    public void addChicken(Chicken chicken){
        for (int i = 0; i < 15; i++) {
            numOfChickens.add(chicken);
        }
    }


}
