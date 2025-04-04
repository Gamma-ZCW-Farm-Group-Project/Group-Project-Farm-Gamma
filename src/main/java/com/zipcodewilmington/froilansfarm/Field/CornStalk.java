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

    // Fertilize the crop
    public void fertalize() {
        this.fertilized = true;
    }

    // Yield corn (add it to the passed ArrayList)
    public void yield(ArrayList<Edible> corn) {
        if (!hasBeenHarvested&&fertilized) {
            corn.add(new Corn());  // Assuming Corn is a subclass of Edible
        }
    }
}

