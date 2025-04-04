package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Field.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.RideAble;

public class Tractor implements FarmVehicle, NoiseMaker, RideAble {
    private boolean isOperating = true;
    private boolean isHarvesting = false;
    private boolean isInUse = false;
    private String operator;
    private boolean mounted=false;

    // Constructor for Tractor class
    public Tractor() {
        this.isOperating = true;
        this.isHarvesting = false;
        this.isInUse = false;
        this.operator = null;
    }
    public void mount(){
        mounted=true;
    }
    public void dismount(){
        mounted=false;
    }
    public boolean isMounted(){
        return mounted;
    }

    // Check if the tractor is harvesting any crops (returns true if harvesting)
    public boolean isHarvesting() {
        return isHarvesting;
    }

    // Start harvesting by setting the state to isHarvesting = true
    public void harvest() {
        isHarvesting = true;
        isOperating = true;
    }

    // Ride method to assign an operator and set the tractor to in-use
    public Object ride(String operatorName) {
        this.operator = operatorName;
        this.isInUse = true;
        return operatorName;
    }

    // Tractor makes a noise ("Vroom")
    public String makeNoise() {
        return "Vroom";
    }

    // Operate method to check if tractor is operating (in use)
    @Override
    public void operate() {
        isOperating = true; // Tractor is operating
    }

    // Check if any crop in the field has been harvested (returns true if at least one crop is harvested)
    public boolean isOperating(Field field) {
        // Logic to check if the tractor is operating based on the field conditions (e.g., harvest status)
        for (CropRow row : field.getCropRows()) {
            for (Crop crop : row.getCrops()) {
                if (crop.isFertilized()) {
                    return false;
                }
            }
        }
        return true;
    }
}
