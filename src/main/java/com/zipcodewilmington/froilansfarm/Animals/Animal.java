package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Shelters.Shelter;

import java.util.ArrayList;
import java.util.Objects;

public class Animal extends Shelter {
    private ArrayList<Objects> animals; //Subject to change based on finding the correct type

    public Animal(){
        this.animals = new ArrayList<>();
    }

    public ArrayList<Objects> getAnimal(){//Subject to change based on finding the correct type

        return animals;
    }
}
