package VehicleTest;

import com.zipcodewilmington.froilansfarm.Field.*;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TractorTest {

    private Tractor tractor;
    private Field field;

    @BeforeEach
    public void setUp() {
        tractor = new Tractor();  // Create a new Tractor instance
        field = new Field();      // Create a new Field instance

        // Create CropRows
        CropRow cornRow = new CropRow();
        CropRow tomatoRow = new CropRow();



        // Add rows to the field
        field.addCropRow(cornRow);
        field.addCropRow(tomatoRow);
    }

    // Test for checking if the tractor can harvest crops
    @Test
    public void testOperate() {
        tractor.operate();
        assertTrue(tractor.isOperating(field), "The tractor should be operating after the operate method is called.");
    }

    // Test for checking if the tractor is harvesting
    @Test
    public void testIsHarvesting() {
        tractor.harvest();
        assertTrue(tractor.isHarvesting(), "The tractor should be harvesting after calling the harvest method.");
    }

    // Test for checking if the tractor can be ridden
    @Test
    public void testRide() {
        String operator = "Froilan";
        Object result = tractor.ride(operator);

        // Check if the operator is correctly assigned
        assertEquals(operator, result, "The operator should be 'Farmer John' when the tractor is ridden.");
    }

    // Test for checking the noise the tractor makes
    @Test
    public void testMakeNoise() {
        String noise = tractor.makeNoise();
        assertEquals("Vroom", noise, "The tractor should make the noise 'Vroom'.");
    }


}