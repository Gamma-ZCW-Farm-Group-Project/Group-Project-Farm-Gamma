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
    }

    // tractor can harvest crops
    @Test
    public void testOperate() {
        tractor.operate();
        assertTrue(tractor.isOperating(field), "The tractor should be operating after the operate method is called.");
    }

    //tractor is harvesting
    @Test
    public void testIsHarvesting() {
        tractor.harvest();
        assertTrue(tractor.isHarvesting());
    }

    // Test if tractor can be ridden
    @Test
    public void testRide() {
        String operator = "Froilan";
        Object result = tractor.ride(operator);

        // Check if the operator is correctly assigned
        assertEquals(operator, result);
    }

    // Test for checking the noise the tractor makes
    @Test
    public void testMakeNoise() {
        String noise = tractor.makeNoise();
        assertEquals("Vroom", noise, "The tractor should make the noise 'Vroom'.");
    }
@Test
    public void testMount() {
    tractor.mount();
    assertTrue(tractor.isMounted());
    }
    @Test
    public void testDismount() {
        tractor.mount();
        tractor.dismount();
        assertFalse(tractor.isMounted());
    }

}