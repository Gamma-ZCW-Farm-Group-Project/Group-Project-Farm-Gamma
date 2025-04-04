package com.zipcodewilmington.froilansfarm.Shelters;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;

public class Stable extends Shelter{
    Horse horse = new Horse();
    public static ArrayList<Horse> stable1 = new ArrayList<>(2);
    public static ArrayList<Horse> stable2 = new ArrayList<>(2);
    public static ArrayList<Horse> stable3 = new ArrayList<>(3);


    public void Horse(){
        stable1 = new ArrayList<>(2);
        stable2 = new ArrayList<>(2);
        stable3 = new ArrayList<>(3);
        }

//    public ArrayList<Horse> getNumOfHorse(){
//        return numOfHorse;
//    }

    public void addHorse(){
            for (int i = 0; i <= stable1.size(); i++) {
                stable1.add(horse);
            }
            for (int j = 0; j <= stable2.size(); j++) {
                stable2.add(horse);
            }
            for (int k = 0; k <= stable3.size(); k++) {
                stable3.add(horse);
            }

    }
}
