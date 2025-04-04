package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Field.CropRow;

import java.util.ArrayList;

public interface Botanist {
    public void plant(ArrayList<Crop> cropRow, Crop crop);
}
