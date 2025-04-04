package com.zipcodewilmington.froilansfarm.Animals;


import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Shelters.ChickenCoop;

import java.util.ArrayList;

public class Chicken extends Animal implements NoiseMaker, Produce {
    private boolean fertilized = false;

    public void fertilize() {
        this.fertilized = true;
    }
    public boolean isFertilized(){
        return fertilized;
    }

    public String makeNoise(){
        return "buck buck buckooock!";
    }

    public void yield(ArrayList<Edible> e) {
        Egg egg = new Egg();
        if (!fertilized) {
            e.add(egg);
        }
    }
}
