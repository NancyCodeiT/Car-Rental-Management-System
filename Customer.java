public class Customer {
    private String name;
    private String customerId;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    // Getters
    public String getName() { return name; }
    public String getCustomerId() { return customerId; }
}