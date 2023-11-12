import java.awt.*;
public class Saab extends Cars{
    private boolean turboOn;
    protected Saab(){
        direction = 2;
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
        turboOn = false;
        modelName = "Saab95";
        stopEngine();
    }
    protected void setTurboOn(){
        turboOn = true;
    }
    protected void setTurboOff(){ turboOn = false; }

    public boolean getTurbo(){
        return turboOn;

    }
    @Override
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }
}