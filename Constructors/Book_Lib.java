public class Book_Lib {
    String title, author;
    double price;
    boolean available = true;

    Book_Lib(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public static void main(String[] args) {
        Book_Lib b = new Book_Lib("Clean Code", "Robert C. Martin", 550);
        b.borrowBook();
        b.borrowBook();
    }
}
