package vehicle;

public class vehicle {

    private String model;
    private String make;
    private int numberOfwheels;
    private int topSpeed;

    public vehicle(String model, String make, int numberOfwheels, int topSpeed) {
        this.model = model;
        this.make = make;
        this.numberOfwheels = numberOfwheels;
        this.topSpeed = topSpeed;
    }

    public vehicle() {

    }

    public vehicle(String model2, String make2, int numberOfwheels2) {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumberOfwheels() {
        return numberOfwheels;
    }

    public void setNumberOfwheels(int numberOfwheels) {
        this.numberOfwheels = numberOfwheels;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

}
