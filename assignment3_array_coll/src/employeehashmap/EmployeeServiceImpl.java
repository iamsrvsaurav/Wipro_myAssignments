package employeehashmap;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
    private final HashMap<Integer, Employee> employeeMap = new HashMap<>();
    private final Scanner sc = new Scanner(System.in);

    @Override
    public void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Designation (Clerk/System Associate/Programmer/Manager): ");
        String designation = sc.nextLine();

        Employee emp = new Employee(id, name, salary, designation);
        employeeMap.put(id, emp);
        System.out.println("Employee added successfully.");
    }

    @Override
    public void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        if (employeeMap.containsKey(id)) {
            employeeMap.remove(id);
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    @Override
    public void displayByInsuranceScheme() {
        System.out.print("Enter Insurance Scheme (Scheme A/B/C or No Scheme): ");
        String scheme = sc.nextLine();
        boolean found = false;

        for (Employee emp : employeeMap.values()) {
            if (emp.getInsuranceScheme().equalsIgnoreCase(scheme)) {
                System.out.println(emp);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found with the specified insurance scheme.");
        }
    }

    @Override
    public void displaySortedBySalary() {
        List<Employee> list = new ArrayList<>(employeeMap.values());
        Collections.sort(list);

        System.out.println("Employees sorted by salary:");
        for (Employee emp : list) {
            System.out.println(emp);
        }
    }
}
