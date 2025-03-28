package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class CropDuster extends Vehicle implements Aircraft, FarmVehicle  {
    @Override
    public void fly() {
    }

    @Override
    public void operate() {

    }

    public boolean isFlying() {
        return true;
    }

    public void fertilize() {
    }
}
