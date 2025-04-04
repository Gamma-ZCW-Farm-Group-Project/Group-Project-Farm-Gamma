package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

import java.util.ArrayList;

public class Pilot extends Person implements Rider, Eater, NoiseMaker{


    @Override
    public void eat(ArrayList<Edible> e) {
        e.remove(e.size()  - 1);
    }

    @Override
    public String makeNoise() {
        return "I'm a pilot";
    }

    @Override
    public boolean mount() {
        return true;
    }

    @Override
    public boolean dismount() {
        return false;
    }
}
