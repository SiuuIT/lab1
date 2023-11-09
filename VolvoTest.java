import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import java.awt.*;

import static org.junit.Assert.*;

public class VolvoTest {
    private Volvo volvo;

    @Before
    public void init() {
        volvo = new Volvo();
    }


    @Test
    public void testSpeedFactor() {
        assertEquals(1.25, volvo.speedFactor(), 0.0);
    }

    @Test
    public void testStartEngine() {
        volvo.startEngine();
        assertEquals(0.1, volvo.getCurrentSpeed(), 0.0);
    }

    @Test
    public void testStopEngine() {
        volvo.startEngine();
        volvo.stopEngine();
        assertEquals(0, volvo.getCurrentSpeed(), 0.0);
    }
}