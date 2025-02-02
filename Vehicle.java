import java.util.*;

class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 500.00;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(600.00);

        Vehicle v1 = new Vehicle("Alice", "Car");
        v1.displayVehicleDetails();
    }
}
