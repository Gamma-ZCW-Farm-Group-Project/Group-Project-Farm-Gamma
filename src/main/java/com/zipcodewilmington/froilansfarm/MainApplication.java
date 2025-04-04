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
    public static void main(String[] args) {
        MainApplication mainApplication = new MainApplication();
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
        int day=0;
        while (day <= 7){
            mainApplication.oneDaySimulate(froiland, froilanda, cropDuster, tractor, farmhouse, stable, chickenCoop, field, cornStalk, tomatoPlant);
            day++;
        }
    }



    public void oneDaySimulate(Farmer froiland, Pilot froilanda, CropDuster cropDuster, Tractor tractor, Farmhouse farmhouse, Stable stable, ChickenCoop chickenCoop, Field field, CornStalk cornStalk, TomatoPlant tomatoPlant) {

    }


}
