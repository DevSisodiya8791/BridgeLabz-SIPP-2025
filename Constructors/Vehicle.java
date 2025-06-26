class Vehicle {
    String ownerName, vehicleType;
    static int registrationFee = 5000;

    Vehicle(String ownerName, String type) {
        this.ownerName = ownerName;
        this.vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " owns a " + vehicleType + ". Registration Fee: ₹" + registrationFee);
    }

    static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Neha", "Car");
        v.displayVehicleDetails();
        Vehicle.updateRegistrationFee(7000);
        v.displayVehicleDetails();
    }
}
