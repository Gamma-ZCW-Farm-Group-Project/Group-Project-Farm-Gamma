package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.RideAble;

public class CropDuster extends Vehicle implements Aircraft, FarmVehicle, RideAble, NoiseMaker {
    @Override
    public void fly() {
    }

    @Override
    public void operate() {

    }

    public boolean isFlying() {
        return false;
    }

    public void fertilize() {
    }

    @Override
    public String makeNoise() {
        return "";
    }
}
