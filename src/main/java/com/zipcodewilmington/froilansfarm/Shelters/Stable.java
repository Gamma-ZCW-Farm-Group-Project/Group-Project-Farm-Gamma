package com.zipcodewilmington.froilansfarm.Shelters;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;

public class Stable extends Shelter{
    public static ArrayList<Horse> numOfHorse = new ArrayList<Horse>();

    public void Horse(){
        this.numOfHorse = new ArrayList<>();
    }

    public ArrayList<Horse> getNumOfHorse(){
        return numOfHorse;
    }

    public void addHorse(Horse horse){
        numOfHorse.add(horse);
    }
}
