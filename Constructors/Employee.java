class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    void showManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.employeeID = 501;
        m.department = "IT";
        m.setSalary(95000);
        m.showManagerDetails();
        System.out.println("Salary: ₹" + m.getSalary());
    }
}
