package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.RideAble;

public class CropDuster extends Vehicle implements Aircraft, FarmVehicle, RideAble, NoiseMaker {
    private boolean flying= false;

    @Override
    public void fly() {
        flying=true;
    }

    @Override
    public void operate() {
        flying=false;
    }

    public boolean isFlying() {
        return flying;
    }

    public void fertilize() {
        for(CropRow row : field.getCropRows()){
            for(Crop crop: row.getCrops(new CornStalk())){
                crop.hasBeenFertalized();
            }
        }
    }

    @Override
    public String makeNoise() {
        return "";
    }
}
