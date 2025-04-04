package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Shelters.Shelter;

import java.util.ArrayList;
import java.util.Objects;

public class Animal{
    public ArrayList<Objects> animals;

    public Animal(){
        this.animals = new ArrayList<>();
    }

    public ArrayList<Objects> getAnimal(){
        return animals;
    }
}
