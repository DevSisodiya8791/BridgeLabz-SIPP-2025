class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double cost, int qty) {
        itemName = name;
        price = cost;
        quantity = qty;
    }

    void removeItem() {
        itemName = null;
        price = 0;
        quantity = 0;
        System.out.println("Item removed from cart.");
    }

    void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem();
        cart.addItem("Laptop", 50000, 1);
        cart.displayTotalCost();
        cart.removeItem();
    }
}
