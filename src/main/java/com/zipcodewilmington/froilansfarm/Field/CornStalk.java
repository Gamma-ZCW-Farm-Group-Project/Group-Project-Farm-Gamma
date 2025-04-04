package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Edibles.Corn;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

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
    // Yield corn (add it to the passed ArrayList)
    public void yeild(ArrayList<Edible> corn) {
        if (!hasBeenHarvested&&fertilized) {
            corn.add(new Edible());  // Assuming Corn is a subclass of Edible
        }
    }
}

