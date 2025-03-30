package com.zipcodewilmington.froilansfarm.Shelters;

import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Person;
import com.zipcodewilmington.froilansfarm.People.Pilot;


import java.util.ArrayList;

public class Farmhouse {
    public static ArrayList<Person> people = new ArrayList<Person>();

    public void Person(){
        this.people = new ArrayList<>();
    }

    public ArrayList<Person> getPeople(){
        return people;
    }

    public void Farmer(){
        this.people = new ArrayList<>();
    }

    public ArrayList<Person> getFarmer(){
        return people;
    }

    public void Pilot(){
        this.people = new ArrayList<>();
    }

    public ArrayList<Person> getPilot(){
        return people;
    }

}
