class Item {
    int itemCode;
    String itemName;
    double price;

    void displayItemDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Unit Price: " + price);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.itemCode = 1001;
        item.itemName = "Keyboard";
        item.price = 750;
        item.displayItemDetails(3);
    }
}
