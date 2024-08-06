package view;

import model.Employee;

import java.util.List;

public class EmployeeView {
    public void displayEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Department: " + employee.getDepartment() + ", Salary: " + employee.getSalary());
        }
    }

    public void displayEmployee(Employee employee) {
        if (employee != null) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Department: " + employee.getDepartment() + ", Salary: " + employee.getSalary());
        } else {
            System.out.println("Employee not found.");
        }
    }
}
