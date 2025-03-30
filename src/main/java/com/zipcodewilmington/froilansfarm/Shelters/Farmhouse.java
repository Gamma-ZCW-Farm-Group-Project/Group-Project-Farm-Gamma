package com.zipcodewilmington.froilansfarm.Shelters;

import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Person;
import com.zipcodewilmington.froilansfarm.People.Pilot;


import java.util.ArrayList;

public class Farmhouse extends Shelter{
    private ArrayList<Person> people;
    private ArrayList<Farmer> farmer;
    private ArrayList<Pilot>  pilot;

    public Farmhouse() {
        this.people = new ArrayList<>();
        this.farmer = new ArrayList<>();
        this.pilot = new ArrayList<>();
    }

    public void Person(){
        this.people = new ArrayList<>();
    }

    public ArrayList<Person> getPeople(){
        return people;
    }

    public void Farmer(){
        this.farmer = new ArrayList<>();
    }

    public ArrayList<Farmer> getFarmer(){
        return farmer;
    }

    public void Pilot(){
        this.pilot = new ArrayList<>();
    }

    public ArrayList<Pilot> getPilot(){
        return pilot;
    }

}
