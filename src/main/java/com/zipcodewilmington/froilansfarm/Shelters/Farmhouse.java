package com.zipcodewilmington.froilansfarm.Shelters;

import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Person;
import com.zipcodewilmington.froilansfarm.People.Pilot;


import java.util.ArrayList;

public class Farmhouse extends Shelter{
    public ArrayList<Person> people;

    public Farmhouse() {
        this.people = new ArrayList<>();
    }

    public void Person(){
        this.people = new ArrayList<>();
    }

    public ArrayList<Person> getPeople(){
        return people;
    }


}
