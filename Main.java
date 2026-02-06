import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginSystem auth = new LoginSystem();
        
        // 1. Authenticate first
        if (auth.startLogin()) {
            RentalAgency agency = new RentalAgency();
            Scanner scanner = new Scanner(System.in);

            // 2. Initialize the fleet
            agency.addCar(new Car("C001", "Toyota Land Cruiser"));
            agency.addCar(new Car("C002", "Range Rover Sport"));
            agency.addCar(new Car("C003", "Mercedes G-Wagon"));

            System.out.println("\n===== CAR RENTAL MANAGEMENT SYSTEM =====");
            agency.listAvailableCars();

            // 3. Handle Customer Name Input
            System.out.println("\nEnter Customer Name:");
            String name = scanner.nextLine().trim();
            
            // If the user just pressed Enter, give them a default name to keep it professional
            if (name.isEmpty()) {
                name = "Valued Customer";
            }
            
            Customer user = new Customer(name, "ID-2026");

            // 4. Handle Car Selection Input
            System.out.print("Enter Car ID to rent (e.g., C001): ");
            String selectedId = scanner.nextLine().trim(); // .trim() fixes the "ID not found" error

            // 5. Process the Rental
            agency.rentCar(selectedId, user);

            // 6. Final Display for Screenshot
            System.out.println("\n--- Updated Fleet Status ---");
            agency.listAvailableCars();
            
            System.out.println("\nTransaction complete. Thank you, " + name + "!");
            scanner.close();
        }
    }
}