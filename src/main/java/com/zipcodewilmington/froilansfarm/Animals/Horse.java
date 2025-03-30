package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Shelters.Stable;

import java.util.ArrayList;

public class Horse implements Eater, NoiseMaker, Rider {
    public void horseList(Stable obj, Horse horseNum){
        ArrayList<Horse> listOfHorse = obj.getNumOfHorse();
        listOfHorse.add(horseNum);
    }

    @Override
    public void eat() {

    }

    @Override
    public String makeNoise() {
        return "Yee hee hee hee hee hee";
    }

    @Override
    public boolean mount() {
        //Needs boolean to be able to mount
        return false;
    }

    @Override
    public boolean dismount() {
        //Needs boolean to be able to dismount
        return false;
    }
}
