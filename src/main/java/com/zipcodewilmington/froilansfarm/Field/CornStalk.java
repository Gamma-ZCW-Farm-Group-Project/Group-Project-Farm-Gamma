package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.ArrayList;

public class CornStalk implements Produce {
        public boolean hasBeenFertilized() {
            return false;
        }

        public boolean hasBeenHarvested() {
            return false;

        }

        public void fertilize() {
        }

        public void yield(ArrayList<Edible> corn) {

        }
    }

