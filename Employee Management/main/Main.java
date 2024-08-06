package main;

import controller.EmployeeController;
import model.Employee;
import model.EmployeeService;
import view.EmployeeView;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        EmployeeView employeeView = new EmployeeView();

        EmployeeController employeeController = new EmployeeController(employeeService, employeeView);

        employeeController.addEmployee(new Employee("Alice", "HR", 50000));
        employeeController.addEmployee(new Employee("Bob", "Engineering", 60000));

        employeeController.displayAllEmployees();

        employeeController.displayEmployeeById(1);
    }
}
