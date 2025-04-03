package com.zipcodewilmington.froilansfarm.Field;

import java.util.ArrayList;

public class Field {
    public ArrayList<Crop> getCropRow;
    private ArrayList<CropRow> cropRows = new ArrayList<>();
    private Field field;

    public void addCropRow(CropRow row){
        cropRows.add(row);
    }

    public ArrayList<CropRow> getCropRows() {
        return cropRows;
    }
}
