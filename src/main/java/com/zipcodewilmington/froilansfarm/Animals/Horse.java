package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.Corn;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Shelters.Stable;

import java.util.ArrayList;

public class Horse extends Animal implements Eater, NoiseMaker, Rider {
    @Override
    public String makeNoise() {
        return "Yee hee hee hee hee hee";
    }

    @Override
    public boolean mount() {
        return true;
    }

    @Override
    public boolean dismount() {
        return true;
    }

    @Override
    public void eat(ArrayList<Edible> e) {
        Corn corn = new Corn();
        e.remove(corn);
    }
}
