import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Car> fleet;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
    }

    // Add a car to the agency's inventory
    public void addCar(Car car) {
        fleet.add(car);
    }

    // Display only cars that are currently available
    public void listAvailableCars() {
        System.out.println("\n--- Current Fleet Availability ---");
        for (Car car : fleet) {
            if (car.isAvailable()) {
                System.out.println("ID: " + car.getCarId() + " | Model: " + car.getModel());
            }
        }
    }

    // Logic to rent a car
    public void rentCar(String carId, Customer customer) {
        for (Car car : fleet) {
            if (car.getCarId().equalsIgnoreCase(carId)) {
                if (car.isAvailable()) {
                    car.setAvailable(false);
                    System.out.println("\n[SUCCESS] " + customer.getName() + " has rented the " + car.getModel());
                    return;
                } else {
                    System.out.println("\n[ERROR] Car is already rented.");
                    return;
                }
            }
        }
        System.out.println("\n[ERROR] Car ID not found.");
    }
}