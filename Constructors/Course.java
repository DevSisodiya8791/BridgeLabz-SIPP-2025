class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Tech Institute";

    Course(String name, int duration, double fee) {
        this.courseName = name;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " - " + duration + " weeks - ₹" + fee + " at " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 3000);
        c1.displayCourseDetails();
        Course.updateInstituteName("Code Academy");
        Course c2 = new Course("Python", 8, 4000);
        c2.displayCourseDetails();
    }
}
