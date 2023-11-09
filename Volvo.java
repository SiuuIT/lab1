import java.awt.*;
public class Volvo extends Cars {
    public final static double trimFactor = 1.25;
    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }
    public Volvo(){
        direction = 2;
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }
}

