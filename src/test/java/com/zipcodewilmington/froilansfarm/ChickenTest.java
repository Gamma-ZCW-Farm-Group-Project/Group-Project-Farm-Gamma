package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ChickenTest {

    Chicken chicken = new Chicken();

    @Test
    void ChickenMakeNoiseTest(){
        String expected = "buck buck buckooock!";

        String actual = chicken.makeNoise();

        Assertions.assertEquals(expected, actual);
    }


}
