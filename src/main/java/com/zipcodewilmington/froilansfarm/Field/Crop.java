package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.ArrayList;
import java.util.List;

public class Crop implements Produce {
    private boolean fertilized = false;
    private boolean hasBeenHarvested= false;

    public void fertilize() {
        this.fertilized = true;
    }
    public void harvest(){
        this.hasBeenHarvested=true;
    }

    public boolean isFertilized() {
        return fertilized;
    }

    public boolean isHarvested() {
        return hasBeenHarvested;
    }

    public void yield(ArrayList<Edible> item) {

    }

}
