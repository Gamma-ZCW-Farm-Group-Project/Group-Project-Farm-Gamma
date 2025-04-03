//package com.zipcodewilmington.froilansfarm.Field;
//
//import com.zipcodewilmington.froilansfarm.Edibles.Corn;
//import com.zipcodewilmington.froilansfarm.Edibles.Edible;
//import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
//
//import java.util.ArrayList;
//
//public class CornStalk implements Produce {
//    private boolean hasBeenHarvested = false;
//    private boolean fertalized = false;
//
//    // Check if the crop has been harvested
//    public boolean hasBeenHarvested() {
//        return hasBeenHarvested;
//    }
//
//    // Set the crop as harvested
//    public void harvest() {
//        hasBeenHarvested = true;
//    }
//
//    // Fertilize the crop
//    public boolean fertalized() {
//        fertalized = true;
//        return false;
//    }
//
//    // Yield corn (add it to the passed ArrayList)
//    public void yield(ArrayList<Edible> corn) {
//        if (!hasBeenHarvested) {
//            corn.add(new Corn());  // Assuming Corn is a subclass of Edible
//        }
//    }
//}
//
