package controller;

import model.Employee;
import model.EmployeeService;
import view.EmployeeView;

import java.util.List;

public class EmployeeController {
    private EmployeeService employeeService;
    private EmployeeView employeeView;

    public EmployeeController(EmployeeService employeeService, EmployeeView employeeView) {
        this.employeeService = employeeService;
        this.employeeView = employeeView;
    }

    public void addEmployee(Employee employee) {
        employeeService.addEmployee(employee);
    }

    public void displayAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        employeeView.displayEmployees(employees);
    }

    public void displayEmployeeById(int id) {
        Employee employee = employeeService.getEmployeeById(id);
        employeeView.displayEmployee(employee);
    }
}
