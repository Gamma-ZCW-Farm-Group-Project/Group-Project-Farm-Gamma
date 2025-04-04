package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class ChickenTest {

    Chicken chicken = new Chicken();

    @Test
    void chickenMakeNoiseTest(){
        String expected = "buck buck buckooock!";

        String actual = chicken.makeNoise();

        Assertions.assertEquals(expected, actual);
    }
}
