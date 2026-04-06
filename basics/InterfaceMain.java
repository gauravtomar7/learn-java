package basics;

interface Bike {
    void turnOnEngine();
    void accelerate();
}

class MotorCycle implements Bike {

    boolean isEngineOn;
    int speed;

    public MotorCycle() {
        isEngineOn = false;
        speed = 0;
    }

    @Override
    public void turnOnEngine() {
        // turn on the engine
        isEngineOn = true;
        System.out.println("Engine is ON");
    }

    @Override
    public void accelerate() {
        if (isEngineOn) {
            speed = speed + 10;
            System.out.println("Speed increased to: " + speed);
        } else {
            System.out.println("Start the engine first!");
        }
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        MotorCycle bike = new MotorCycle();

        bike.turnOnEngine();   // turning on engine
        bike.accelerate();     // speed = 10
        bike.accelerate();     // speed = 20
    }
}