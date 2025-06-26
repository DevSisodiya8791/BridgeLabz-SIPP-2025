class Student {
    static String universityName = "Delhi University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void display() {
        if (this instanceof Student) {
            System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Grade: " + grade);
            System.out.println("University: " + universityName);
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Amit", 102, 'A');
        s.display();
        Student.displayTotalStudents();
    }
}
