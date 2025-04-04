package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Shelters.Stable;

import java.util.ArrayList;

public class Horse extends Animal implements Eater, NoiseMaker, Rider {
    public void horseList(Stable obj, Horse horse){
        ArrayList<Horse> listOfHorse = obj.getNumOfHorse();
        listOfHorse.add(horse);
    }

    @Override
    public void eat(ArrayList<Edible> e) {

    }

    @Override
    public String makeNoise() {
        return "Yee hee hee hee hee hee";
    }

    @Override
    public boolean mount() {
        return true;
    }

    @Override
    public boolean dismount() {
        //Needs boolean to be able to dismount
        return true;
    }
}
