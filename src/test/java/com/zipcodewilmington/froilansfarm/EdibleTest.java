package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edibles.Corn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EdibleTest {
    private Tomato tomato;
    private Corn corn;
    private Egg egg;


    @BeforeEach
    void setUp() {
        tomato = new Tomato();
        corn = new Corn();
    }

    @Test
    void testTomatoInitialState() {
        assertFalse(tomato.hasBeenFertilized());
        assertFalse(tomato.hasBeenHarvested());
    }

    @Test
    void testCornInitialState() {
        assertFalse(corn.hasBeenFertilized());
        assertFalse(corn.hasBeenHarvested());
    }

    @Test
    void testTomatoFertilize() {
        tomato.fertilize();
        assertTrue(tomato.hasBeenFertilized());
    }

    @Test
    void testCornFertilize() {
        corn.fertilize();
        assertTrue(corn.hasBeenFertilized());
    }

    @Test
    void testTomatoHarvestBeforeFertilize() {
        assertFalse(tomato.yield());
    }

    @Test
    void testCornHarvestBeforeFertilize() {
        assertFalse(corn.yield());
    }

    @Test
    void testTomatoYieldAfterFertilization() {
        tomato.fertilize();
        assertTrue(tomato.yield());
        assertTrue(tomato.hasBeenHarvested());
    }

    @Test
    void testCornYieldAfterFertilization() {
        corn.fertilize();
        assertTrue(corn.yield());
        assertTrue(corn.hasBeenHarvested());
    }
    @Test
    void testEggEdibility() {
        assertTrue(egg.isEdible());
        egg.fertilized();
        assertFalse(egg.isEdible());
    }
}
