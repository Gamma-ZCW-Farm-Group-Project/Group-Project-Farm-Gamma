package com.zipcodewilmington.froilansfarm.Shelters;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Shelter {

    private Object farmHouse;
    private ArrayList<Objects> chickenCoops;
    private ArrayList<Objects> stables;

    public void setFarmHouse(){
        this.farmHouse = farmHouse;
    }

    public Object getFarmHouse() {
        return farmHouse;
    }

    public void setChickenCoops(){
        this.chickenCoops = new ArrayList<>(4);
    }

    public ArrayList<Objects> getChickenCoops(){
        return chickenCoops;
    }

    public void setStables(){
        this.stables = new ArrayList<>(3);
    }

    public ArrayList<Objects> getStables(){
        return stables;
    }
}
