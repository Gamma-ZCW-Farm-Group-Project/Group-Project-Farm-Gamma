package com.zipcodewilmington.froilansfarm.Animals;


import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.ArrayList;

public class Chicken extends Animal implements NoiseMaker, Produce {
    private boolean hasBeenFertilized = false;

    public void fertilize() {
        this.hasBeenFertilized = true;
    }
    public boolean isHasBeenFertilized(){
        return hasBeenFertilized;
    }

    public String makeNoise(){
        return "buck buck buckooock!";
    }

    public void yield(ArrayList<Edible> e) {
        Egg egg = new Egg();
        if (!hasBeenFertilized) {
            e.add(egg);
        }
    }
}
