package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Shelters.ChickenCoop;

import java.util.ArrayList;

public class Chicken implements Eater, NoiseMaker, Produce {
    public void chickenList(ChickenCoop obj, Chicken chickenNum){
        ArrayList<Chicken> listOfChickens = obj.getNumOfChickens();
        listOfChickens.add(chickenNum);
    }

    public void eat(){
    }

    public String makeNoise(){
        return null;
    }


    @Override
    public void yield() {

    }
}
