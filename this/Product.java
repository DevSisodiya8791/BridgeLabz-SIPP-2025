class Product {
    static double discount = 10.0; // percentage
    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void display() {
        if (this instanceof Product) {
            System.out.println("ID: " + productID + ", Name: " + productName + ", Price: ₹" + price);
            System.out.println("Quantity: " + quantity + ", Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product p = new Product(1, "Laptop", 60000, 2);
        p.display();
        Product.updateDiscount(15.0);
        p.display();
    }
}
