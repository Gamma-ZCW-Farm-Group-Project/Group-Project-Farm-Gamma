package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Pilot extends Person implements Rider, Eater, NoiseMaker{


    @Override
    public void eat() {
        
    }

    @Override
    public String makeNoise() {
        return "";
    }

    @Override
    public boolean mount() {

    }

    @Override
    public boolean dismount() {

    }
}
