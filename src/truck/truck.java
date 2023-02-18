package truck;

import vehicle.vehicle;

public class truck extends vehicle {

    private String AC;
    private String HandBrake;
    private String sound;
    private String engine;
    private int accelerate;
    private int breaks;
    private String handbrake;

    public truck(String model, String make, int numberOfwheels, int topSpeed, String aC, String handBrake, String sound,
            String engine, int accelerate, int breaks, String handbrake2) {
        super(model, make, numberOfwheels, topSpeed);
        this.AC = aC;
        this.HandBrake = handBrake;
        this.sound = sound;
        this.engine = engine;
        this.accelerate = accelerate;
        this.breaks = breaks;
        this.handbrake = handbrake2;
    }

    public truck() {

    }

    public String getAC() {
        return AC;
    }

    public void setAC(String aC) {
        AC = aC;
    }

    public String getHandBrake() {
        return HandBrake;
    }

    public void setHandBrake(String handBrake) {
        HandBrake = handBrake;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
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

    public String getHandbrake() {
        return handbrake;
    }

    public void setHandbrake(String handbrake) {
        this.handbrake = handbrake;
    }

}
