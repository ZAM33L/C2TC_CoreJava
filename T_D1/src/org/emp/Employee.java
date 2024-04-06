package org.emp;
import org.client.*;
import org.company.*;
import org.project.*;

public class Employee {
public void empName() {
	// TODO Auto-generated method stub
System.out.println("employee name is karthi");
}
public static void main(String[] args) {
	Employee e = new Employee();
	Client cl = new Client();
	Company cp = new Company();
	Project pr = new Project();
	e.empName();
	cl.clientName();
	pr.projectName();
	cp.companyName();
}
}
