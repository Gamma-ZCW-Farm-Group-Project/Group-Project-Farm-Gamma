package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Field.CornStalk;
import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Field.Field;
import com.zipcodewilmington.froilansfarm.Field.TomatoPlant;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Shelters.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelters.Farmhouse;
import com.zipcodewilmington.froilansfarm.Shelters.Stable;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {
    public static void main(String[] args){
        MainApplication mainApplication = new MainApplication();
        mainApplication.simulateWeek();
    }

    public void setUpObjects(){
        Farmer froiland = new Farmer();
        Pilot froilanda = new Pilot();
        CropDuster cropDuster = new CropDuster();
        Tractor tractor = new Tractor();
        Farmhouse farmhouse = new Farmhouse();
        Stable stable = new Stable();
        ChickenCoop chickenCoop = new ChickenCoop();
        Field field = new Field();
        CornStalk cornStalk = new CornStalk();
        TomatoPlant tomatoPlant = new TomatoPlant();
    }

    public void oneDaySimulate(){
        setUpObjects();
    }

    public void simulateWeek(){
        for (int i = 0; i < 7; i++){
            oneDaySimulate();
        }
    }

}
