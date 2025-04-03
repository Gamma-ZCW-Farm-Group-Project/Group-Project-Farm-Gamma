package com.zipcodewilmington.froilansfarm.Shelters;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Shelter {

    private ArrayList<Objects> shelters;

    public void Shelter(){
        this.shelters = new ArrayList<>();
    }

    public ArrayList<Objects> getShelters(){
        return shelters;
    }

}
