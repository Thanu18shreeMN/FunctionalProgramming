package inter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



class Customer {
    String customerName;
    String planType;
    String location;
    float planAmount;

    public Customer(String customerName, String planType, String location, float planAmount) {
        this.customerName = customerName;
        this.planType = planType;
        this.location = location;
        this.planAmount = planAmount;
    }

    public float getPlanAmount() {
        return planAmount;
    }

    public String toString() {
        return "Customer: " + customerName + " | Plan Type: " + planType + " | Location: " + location + " | Plan Amount: " + planAmount;
    }
}

public class CustomerPlan {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Alice", "Basic", "City A", 150.0f));
        customers.add(new Customer("Bob", "Premium", "City B", 250.0f));
        customers.add(new Customer("Carol", "Standard", "City C", 180.0f));

        customers.sort(Comparator.comparing(Customer::getPlanAmount));

        System.out.println("Sorted Customers:");
        customers.forEach(System.out::println);

        CustomerFilter filter = customer -> customer.getPlanAmount() >= 200;

        List<Customer> filteredCustomers = filterCustomers(customers, filter);

        System.out.println("\nCustomers with Plan Amount >= 200:");
        filteredCustomers.forEach(System.out::println);
    }

    public static List<Customer> filterCustomers(List<Customer> customers, CustomerFilter filter) {
        List<Customer> filtered = new ArrayList<>();
        for (Customer customer : customers) {
            if (filter.filter(customer)) {
                filtered.add(customer);
            }
        }
        return filtered;
    }
}
