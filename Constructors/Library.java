class Book {
    String title, author;
    double price;
    boolean available = true;

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Clean Code";
        b.author = "Robert C. Martin";
        b.price = 550;
        b.borrowBook();
        b.borrowBook();
    }
}
