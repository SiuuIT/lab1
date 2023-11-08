import java.awt.*;

class Saab extends Cars{
    public boolean turboOn;
    public Saab(){
        direction = 2;
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
        turboOn = false;
        modelName = "Saab95";
        stopEngine();
    }
    void setTurboOn(){
        turboOn = true;
    }
    void setTurboOff(){
        turboOn = false;
    }
    double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }
}