package employeehashmap;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    public Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = determineInsuranceScheme(salary, designation);
    }

    private String determineInsuranceScheme(double salary, String designation) {
        if (salary < 5000 && designation.equalsIgnoreCase("Clerk")) {
            return "No Scheme";
        } else if (salary > 5000 && salary < 20000 && designation.equalsIgnoreCase("System Associate")) {
            return "Scheme A";
        } else if (salary >= 20000 && salary < 40000 && designation.equalsIgnoreCase("Programmer")) {
            return "Scheme C";
        } else if (salary >= 40000 && designation.equalsIgnoreCase("Manager")) {
            return "Scheme B";
        } else {
            return "No Scheme";
        }
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String getDesignation() { return designation; }
    public String getInsuranceScheme() { return insuranceScheme; }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nName: " + name + "\nSalary: " + salary +
               "\nDesignation: " + designation + "\nInsurance Scheme: " + insuranceScheme;
    }
}
