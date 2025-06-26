class Book {
    String title;
    String author;
    double price;

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Java Basics";
        b.author = "Deepak Shukla";
        b.price = 399.50;
        b.displayBook();
    }
}
