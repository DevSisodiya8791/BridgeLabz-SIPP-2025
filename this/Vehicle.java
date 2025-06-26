class Vehicle {
    static int registrationFee = 5000;

    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }

    void display() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
            System.out.println("Reg No: " + registrationNumber);
            System.out.println("Fee: ₹" + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Ravi", "Bike", "RJ-14-XYZ1234");
        v.display();
        Vehicle.updateRegistrationFee(6000);
        v.display();
    }
}
