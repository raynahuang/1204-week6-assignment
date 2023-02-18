package bike;

import vehicle.vehicle;

public class bike extends vehicle {
    private String engine;
    private int accelerate;
    private int breaks;


    public bike(String model, String make, int numberOfwheels, int topSpeed, String engine, int accelerate,
            int breaks) {
        super(model, make, numberOfwheels, topSpeed);
        this.engine = engine;
        this.accelerate = accelerate;
        this.breaks = breaks;
    }

    public bike(){
        
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getAccelerate() {
        return accelerate;
    }

    public void setAccelerate(int accelerate) {
        this.accelerate = accelerate;
    }

    public int getBreaks() {
        return breaks;
    }

    public void setBreaks(int breaks) {
        this.breaks = breaks;
    }

}
