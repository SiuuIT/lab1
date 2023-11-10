import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import java.awt.*;

import static org.junit.Assert.*;
public class CarsTest {
    private Volvo volvo;

    @Before
    public void init() {
        volvo = new Volvo();
    }

    @Test
    public void testGetNrDoors() {
        assertEquals(4, volvo.getNrDoors());
    }

    @Test
    public void testGetEnginePower() {
        assertEquals(100, volvo.getEnginePower(), 0.0);
    }

    @Test
    public void testGetCurrentSpeed() {
        assertEquals(0, volvo.getCurrentSpeed(), 0.0);
    }

    @Test
    public void testGetColor() {
        assertEquals(Color.black, volvo.getColor());
    }

    @Test
    public void testSetColor() {
        volvo.setColor(Color.red);
        assertEquals(Color.red, volvo.getColor());
    }

    @Test
    public void testStartEngine() {
        volvo.startEngine();
        assertEquals(0.1, volvo.getCurrentSpeed(),0.0);
    }

    @Test
    public void testStopEngine() {
        volvo.stopEngine();
        assertEquals(0, volvo.getCurrentSpeed(),0.0);
    }

    @Test
    public void testIncrementSpeed() {
        volvo.currentSpeed = 1;
        volvo.gas(1);
        assertEquals(2.25, volvo.getCurrentSpeed(), 0.0);
    }

    @Test
    public void testDecrementSpeed() {
        volvo.currentSpeed = 1;
        volvo.brake(0.1);
        assertEquals(0.875F, (volvo.getCurrentSpeed()),0.0F);
    }
    @Test
    public void testMoveY() {
        volvo.currentSpeed = 1;
        volvo.direction = 4;
        volvo.move();
        volvo.stopEngine();
        assertEquals(-1, volvo.getY(),0.0);
    }

    @Test
    public void testMoveX() {
        volvo.currentSpeed = 1;
        volvo.direction = 3;
        volvo.move();
        volvo.stopEngine();
        assertEquals(1, volvo.getX(), 0.0);
    }
    @Test
    public void testSpeedFactor(){
        assertEquals(1.25, volvo.speedFactor(),0.0);
    }
    @Test
    public void testTurnLeft() {
        volvo.turnLeft();
        assertEquals(1,volvo.direction);
    }
    @Test
    public void testTurnRight() {
        volvo.turnRight();
        assertEquals(3,volvo.direction);
    }


    @Test
    public void testGasAndBrake() {
        Cars car = new Cars();
        car.startEngine();

        car.gas(0.5);
        assertTrue(car.getCurrentSpeed() >= 0 && car.getCurrentSpeed() <= car.getEnginePower());

        car.brake(0.3);
        assertTrue(car.getCurrentSpeed() >= 0 && car.getCurrentSpeed() <= car.getEnginePower());

        car.gas(-0.1);
        assertTrue(car.getCurrentSpeed() >= 0 && car.getCurrentSpeed() <= car.getEnginePower());

        car.brake(1.5);  // Expecting the speed to remain the same (not increased)
        assertTrue(car.getCurrentSpeed() >= 0 && car.getCurrentSpeed() <= car.getEnginePower());
    }
}