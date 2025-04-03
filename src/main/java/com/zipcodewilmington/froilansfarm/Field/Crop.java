package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Crop{
    private boolean hasBeenFertalized= false;
    private boolean hasBeenHarvested= false;

    public void Fertalized(){
        hasBeenFertalized=true;
    }
    public void Harvested(){
        hasBeenHarvested=true;
    }

    public boolean hasBeenFertalized() {
        return hasBeenFertalized;
    }

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

//    @Override
//    public void yield() {
//
//
//    }

}
