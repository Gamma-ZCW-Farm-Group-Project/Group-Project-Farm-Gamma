package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;

import java.util.ArrayList;

public class TomatoPlant extends Crop {
    private boolean hasBeenHarvested = false;
    private boolean fertilized = false;

    // Set the crop as harvested
    public void harvested() {
        this.hasBeenHarvested = true;
    }

    // Fertilize the crop
    public void fertalize() {
        this.fertilized = true;
    }

    // Yield tomato (add it to the passed ArrayList)
    public void yield(ArrayList<Edible> tomato) {
        if (!hasBeenHarvested&&fertilized) {
            tomato.add(new Edible());  // Assuming tomato is a subclass of Edible
        }
    }

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }
}
