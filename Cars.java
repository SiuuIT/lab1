import java.awt.*;
public class Cars implements Movable {
    public int direction = 2;
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name


    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public void incrementSpeed(double amount) {
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
            decrementSpeed(amount);}
    }

    public void decrementSpeed(double amount) {
        currentSpeed = Math.max((getCurrentSpeed() - (speedFactor() * amount)), 0);
    }

    double x_coordinate = 0;
    double y_coordinate = 0;

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
            direction = 4; }
    }
    public void turnRight() {
        direction += 1;
        if (direction == 5) {
            direction = 1;}
    }
}

