package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;

import java.util.ArrayList;

public class CornStalk extends Crop {
    private boolean hasBeenHarvested = false;
    private boolean fertilized = false;



    // Set the crop as harvested
    public void harvested() {
        this.hasBeenHarvested = true;
    }
    public boolean hasBeenHarvested(){
        return hasBeenHarvested;
    }
    // Fertilize the crop
    public void fertilize() {
        this.fertilized = true;
    }
    public boolean isFertilized(){
        return fertilized;
    }
    // Yield corn (add it to the ArrayList)
    public void yield(ArrayList<Edible> corn) {
        if (!hasBeenHarvested&&fertilized) {
            corn.add(new Edible());  // Corn is a subclass of Edible
        }
    }
}

