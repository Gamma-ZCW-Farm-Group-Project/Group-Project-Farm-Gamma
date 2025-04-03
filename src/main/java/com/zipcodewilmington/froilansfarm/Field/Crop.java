package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.ArrayList;
import java.util.List;

public class Crop implements Produce {
    private boolean hasBeenFertalized= false;
    private boolean hasBeenHarvested= false;

    public void fertalize(){
        hasBeenFertalized=true;
    }
    public void Harvested(){
        hasBeenHarvested=true;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertalized;
    }

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }
    public void yield(ArrayList<Edible> corn) {

    }

}
