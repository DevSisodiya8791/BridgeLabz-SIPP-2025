class CarRental {
    String customerName, carModel;
    int rentalDays;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    void calculateCost() {
        int ratePerDay = 1500;
        System.out.println("Total cost for " + rentalDays + " days: ₹" + (rentalDays * ratePerDay));
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Deepak", "Honda City", 4);
        rental.calculateCost();
    }
}
