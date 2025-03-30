package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChickenTest {

    @Test
    void ChickenMakeNoiseTest(){
        String expected = "buck buck buckooock!";

        String actual = Chicken.makeNoise();

        assertTrue(Boolean.parseBoolean(expected), actual);
    }
}
