package com.zipcodewilmington.froilansfarm.Shelters;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;

public class ChickenCoop extends Shelter {
    Chicken chicken = new Chicken();
    public static ArrayList<Chicken> coop1 = new ArrayList<>(3);
    public static ArrayList<Chicken> coop2 = new ArrayList<>(3);
    public static ArrayList<Chicken> coop3 = new ArrayList<>(3);
    public static ArrayList<Chicken> coop4 = new ArrayList<>(2);


    public void Chicken(){
        coop1 = new ArrayList<>(3);
        coop2 = new ArrayList<>(3);
        coop3 = new ArrayList<>(3);
        coop4 = new ArrayList<>(2);
    }

//    public ArrayList<Chicken> getNumOfChickens(){
//        return numOfChickens;
//    }

    private void addChicken(){
        for (int i = 0; i <= coop1.size(); i++) {
            coop1.add(chicken);
        }
        for (int j = 0; j <= coop2.size(); j++) {
            coop2.add(chicken);
        }
        for (int k = 0; k <= coop3.size(); k++) {
            coop3.add(chicken);
        }
        for (int l = 0; l <= coop4.size(); l++) {
            coop4.add(chicken);
        }
    }


}
