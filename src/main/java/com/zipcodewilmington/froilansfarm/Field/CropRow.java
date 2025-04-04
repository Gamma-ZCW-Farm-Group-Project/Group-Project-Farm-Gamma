package com.zipcodewilmington.froilansfarm.Field;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
        private List<Crop> crops;
     private List<Boolean> fertilizedState;  //list to track fertilized or not


    public CropRow(){
            this.crops=new ArrayList<>();
            fertilizedState=new ArrayList<>();
        }

        public void addCrop( Crop crop, boolean isFertilized) {
            crops.add(crop);
            fertilizedState.add(isFertilized);
        }

        // Get all the crops in this row
        public List<Crop> getCrops() {
            return crops;
        }

        public void fertilizeAll() {
            for (Crop crop : crops) {
                crop.fertilize();
            }
        }
    public List<Boolean> getFertilizedState() {
        return fertilizedState;
    }
}
