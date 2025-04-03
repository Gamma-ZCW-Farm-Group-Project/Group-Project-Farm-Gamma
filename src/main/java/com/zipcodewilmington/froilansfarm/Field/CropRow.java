package com.zipcodewilmington.froilansfarm.Field;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
        private List<Crop> crops = new ArrayList<>();        // List to store the crops (CornStalk, TomatoPlant, etc.)
        private List<Boolean> fertilizedState = new ArrayList<>();  // List to track whether the crop is fertilized (true/false)

        // Method to add a Crop to the CropRow and its corresponding fertilized state
        public void addCrop(Crop crop, boolean hasBeenFertilized) {
            crops.add(crop);                 // Add the crop (CornStalk or TomatoPlant) to the list
            fertilizedState.add(hasBeenFertilized);  // Add the corresponding fertilized state (true/false)
        }

        // Get all the crops in this row
        public List<Crop> getCrops() {
            return crops;
        }

        public List<Boolean> getFertilizedState() {
            return fertilizedState;
    }



}
