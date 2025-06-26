class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double cgpa) {
        this.CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    void showName() {
        System.out.println("Name (protected): " + name);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent();
        pg.rollNumber = 101;
        pg.name = "Raj";
        pg.setCGPA(8.5);
        pg.showName();
        System.out.println("CGPA: " + pg.getCGPA());
    }
}
