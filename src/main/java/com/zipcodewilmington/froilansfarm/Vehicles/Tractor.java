package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Field.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.RideAble;

public class Tractor implements FarmVehicle, NoiseMaker, RideAble {
    private boolean isOperating= true;

    public void operate() {
        isOperating=true;
    }

    public void isOperating(Field field) {
        for(CropRow row : field.getCropRow){
            for(Crop crop: row.getCrops(new CornStalk())){
                crop.hasBeenHarvested();
            }
        }
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
