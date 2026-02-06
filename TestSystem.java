public class TestSystem {
    public static void main(String[] args) {
        System.out.println("--- STARTING UNIT TESTS ---");

        // Test 1: Car Encapsulation
        Car testCar = new Car("T1", "Test Model");
        if (testCar.getCarId().equals("T1") && testCar.isAvailable()) {
            System.out.println("[PASS] Car initialization and getters work.");
        } else {
            System.out.println("[FAIL] Car initialization issue.");
        }

        // Test 2: Rental Agency Logic
        RentalAgency testAgency = new RentalAgency();
        testAgency.addCar(testCar);
        Customer testUser = new Customer("Tester", "000");
        
        testAgency.rentCar("T1", testUser);
        
        if (!testCar.isAvailable()) {
            System.out.println("[PASS] Rental logic correctly updates car state.");
        } else {
            System.out.println("[FAIL] Car state was not updated after rental.");
        }

        System.out.println("--- TESTS COMPLETED ---");
    }
}