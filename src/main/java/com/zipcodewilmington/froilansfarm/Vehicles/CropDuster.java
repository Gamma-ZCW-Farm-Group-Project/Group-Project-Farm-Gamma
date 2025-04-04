package com.zipcodewilmington.froilansfarm.Vehicles;

//import com.zipcodewilmington.froilansfarm.Field.CornStalk;
import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Field.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.RideAble;

public class CropDuster extends Vehicle implements Aircraft, FarmVehicle, RideAble, NoiseMaker {
    private boolean flying;
    private static boolean mounted=false;


    public static void mount(){
        mounted=true;
    }
    public static void dismount(){
        mounted=false;
    }
    public static boolean isMounted(){
        return mounted;
    }

    @Override
    public boolean fly() {
       if(!mounted){
           System.out.println("Mount the Crop Duster before flying.");
           return false;
       }
       if(flying){
           System.out.println("Cropduster is already flying");
           return true;
       }
       flying=true;
        System.out.println("Up Up and away!!!");
        return true;
    }

    @Override
    public void operate() {
        flying=false;
    }

    public boolean isFlying() {
        return flying;
    }

    public void fertilize(Field field) {
        if (!flying) {
            System.out.println("CropDuster must be flying to fertilize crops!");
            return;
        }

        for (CropRow row : field.getCropRows()) {
            for (Crop crop : row.getCrops()) {
                crop.fertilize(); // Calls fertilize on all crops
            }
        }

        System.out.println("All crops have been fertilized.");
    }

    @Override
    public String makeNoise() {
        return "Move here comes the pesticide";
    }
}
