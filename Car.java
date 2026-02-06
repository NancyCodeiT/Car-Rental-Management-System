public class Car {
    private String carId;
    private String model;
    private boolean isAvailable;

    public Car(String carId, String model) {
        this.carId = carId;
        this.model = model;
        this.isAvailable = true; // New cars are available by default
    }

    // Getters
    public String getCarId() { return carId; }
    public String getModel() { return model; }
    public boolean isAvailable() { return isAvailable; }

    // Setters
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}