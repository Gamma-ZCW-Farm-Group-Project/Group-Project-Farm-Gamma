package com.zipcodewilmington.froilansfarm.Shelters;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;

public class Stable extends Shelter{
    public static ArrayList<Horse> numOfHorse = new ArrayList<>();

    public void Horse(){
        numOfHorse = new ArrayList<>();
    }

//    public ArrayList<Horse> getNumOfHorse(){
//        return numOfHorse;
//    }

    public void addHorse(Horse horse){
        for (int i = 0; i < 10; i++) {
            numOfHorse.add(horse);
        }
    }
}
