package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;

import java.util.ArrayList;

public class Miscellaneous extends Crop{
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
    // Yield miscellaneous (add it to the passed ArrayList)
    public void yield(ArrayList<Edible> miscellaneous) {
        if (!hasBeenHarvested&&fertilized) {
            miscellaneous.add(new Edible());  //  miscellaneous is a subclass of Edible
        }
    }

}
