package com.zipcodewilmington.froilansfarm.Animals;


import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Shelters.ChickenCoop;

import java.util.ArrayList;

public class Chicken extends ChickenCoop implements Eater, NoiseMaker, Produce {


    public void chickenList(ChickenCoop obj, Chicken chickenNum){
        ArrayList<Chicken> listOfChickens = obj.getNumOfChickens();
        listOfChickens.add(chickenNum);
    }

    public void eat(){
    }

    public String makeNoise(){
        return "buck buck buckooock!";
    }


    @Override

    public boolean yield() {
        boolean isFertilized = true;
        if (!isFertilized){
            return ;
        }


    public void yield(){
    }
}
