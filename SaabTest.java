import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import java.awt.*;

import static org.junit.Assert.*;
public class SaabTest {
    private Saab saab;

    @Before
    public void init() { saab = new Saab(); }


    @Test
    public void turboOnTest(){
        saab.setTurboOn();
        assertTrue(saab.turboOn); }

    @Test
    public void turboOffTest(){
        saab.setTurboOff();
        assertFalse(saab.turboOn); }
    @Test
    public void speedFactorTestTurbo(){
        saab.setTurboOn();
        assertEquals(1.625, saab.enginePower * 1.3 * 0.01, 0.0);}

    @Test
    public void speedFactorTest(){
        saab.setTurboOff();
        assertEquals(1.25, saab.enginePower*0.01, 0.0);}
}
