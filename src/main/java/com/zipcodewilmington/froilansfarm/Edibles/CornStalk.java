package com.zipcodewilmington.froilansfarm.Edibles;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class CornStalk implements Produce {
    public boolean hasBeenFertilized() {
        return false;
    }

    public boolean hasBeenHarvested() {
        return false;

    }

    public void fertilize() {
    }

    public void yield() {

        return false;
    }
}
