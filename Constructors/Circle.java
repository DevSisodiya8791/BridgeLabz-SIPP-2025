class Circle {
    double radius;

    Circle() {
        this(1.0);  // default radius
    }

    Circle(double radius) {
        this.radius = radius;
    }

    void showArea() {
        System.out.println("Area: " + Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        c1.showArea();
        c2.showArea();
    }
}
