import java.awt.*;
public class Cars implements Movable {
    protected int direction = 2;
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    public int getNrDoors() {
        return nrDoors;
    }
    public double getEnginePower() {
        return enginePower;
    }
    public double getCurrentSpeed() {
        return currentSpeed;
    }
    protected Color getColor() {
        return color;
    }
    public void setColor(Color clr) {
        color = clr;
    }
    protected void startEngine() {
        currentSpeed = 0.1;
    }
    protected void stopEngine() {
        currentSpeed = 0;
    }
    protected void incrementSpeed(double amount) {
        currentSpeed = Math.min((getCurrentSpeed() + (speedFactor() * amount)), enginePower);
    }
    protected double speedFactor() {
        return 0;
    }
    public void gas(double amount) {
        if(0.0D <= amount && amount <= 1.0D) {
            incrementSpeed(amount);
        }
    }
    public void brake(double amount) {
        if(0.0D <= amount && amount <= 1.0D) {
            decrementSpeed(amount);
        }
    }
    protected void decrementSpeed(double amount) {
        currentSpeed = Math.max((getCurrentSpeed() - (speedFactor() * amount)), 0);
    }
    private double x_coordinate = 0;
    private double y_coordinate = 0;
    public double getX(){return this.x_coordinate;
    }
    public double getY(){return this.y_coordinate;
    }
    public void move() {
        if (direction == 1 || direction == 3) {
            if (direction == 1) {
                x_coordinate -= getCurrentSpeed();
            }
                if (direction == 3) {
                    x_coordinate += getCurrentSpeed();
                }
        }
        if (direction == 4 || direction == 2) {
            if (direction == 4) {
                y_coordinate -= getCurrentSpeed();
                }
            if (direction == 2) {
                y_coordinate = y_coordinate+ getCurrentSpeed();
                }
        }
    }
    public void turnLeft() {
        direction = direction - 1;
        if (direction == 0) {
            direction = 4;
        }
    }
    public void turnRight() {
        direction += 1;
        if (direction == 5) {
            direction = 1;
        }
    }
}


