class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String movie, String seat, double cost) {
        movieName = movie;
        seatNumber = seat;
        price = cost;
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Inception", "A10", 250.00);
        ticket.displayTicket();
    }
}
