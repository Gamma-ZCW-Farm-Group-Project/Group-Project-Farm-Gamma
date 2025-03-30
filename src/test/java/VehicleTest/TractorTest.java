package VehicleTest;

import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TractorTest {

    private Tractor tractor;

    @BeforeEach
    void setUp() {
        tractor = new Tractor();
    }

    @Test
    void testOperate() {
        tractor.operate();
        assertTrue(tractor.isOperating(), "Tractor should be operating after calling operate()");
    }

    @Test
    void testHarvest() {
        tractor.harvest();
        assertTrue(tractor.isHarvesting(), "Tractor should be harvesting after calling harvest()");
    }

    @Test
    void testRide() {
        try {
            tractor.ride();
        } catch (Exception e) {
            fail("Ride method threw an exception: " + e.getMessage());
            fail("Ride method threw an exception: " + e.getMessage());
        }
    }
}