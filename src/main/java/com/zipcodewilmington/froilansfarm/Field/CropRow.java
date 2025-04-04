package com.zipcodewilmington.froilansfarm.Field;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
        private List<Crop> crops;
        public void cropRow(){
            this.crops=new ArrayList<>();
        }

        public void addCrop(Crop crop) {
            crops.add(crop);
        }

        // Get all the crops in this row
        public List<Crop> getCrops() {
            return crops;
        }

        public void fertilizeAll() {
            for(Crop crop :crops){
                crop.fertilize();
            }
    }



}
