package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Farmer extends Person implements Rider, NoiseMaker, Botanist, Eater {

    private boolean isRiding = false;

    @Override
    public void plant() {

    }

    @Override
    public void eat() {

    }

    @Override
    public String makeNoise() {
        return "I'm a farmer";
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
