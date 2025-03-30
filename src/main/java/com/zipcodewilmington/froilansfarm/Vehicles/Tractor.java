package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.RideAble;

public class Tractor implements FarmVehicle, NoiseMaker, RideAble {
    public void operate() {
    }

    public boolean isOperating() {
        return false;
    }

    public void harvest() {
    }

    public boolean isHarvesting() {
        return false;
    }

    public Object ride() {
        return null;
    }

    public String makeNoise() {
        return "";
    }
}
