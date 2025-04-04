package com.zipcodewilmington.froilansfarm.Field;

import java.util.ArrayList;

public class Field {
    private ArrayList<CropRow> cropRows;

    public Field(){
        this.cropRows=new ArrayList<>();

    }

    public void addCropRow(CropRow row){
        cropRows.add(row);
    }

    public ArrayList<CropRow> getCropRows() {
        return cropRows;
    }
}
