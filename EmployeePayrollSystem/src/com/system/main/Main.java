package com.system.main;
import com.system.emp.FullTimeEmployee;
import com.system.emp.PartTimeEmployee;
import com.system.payroll.PayrollSystem;

public class Main {
	public static void main(String[] args) {
		PayrollSystem payrollSystem=new PayrollSystem();
		FullTimeEmployee fullTimeEmp1 = new FullTimeEmployee("Aslam",1,15000);//(name,id,salary)
		PartTimeEmployee partTimeEmp2 = new PartTimeEmployee("MadhanKumar",2,40,100);//(name,id,working hourse,salary per houres.
		
		payrollSystem.addEmployee(fullTimeEmp1);
		payrollSystem.addEmployee(partTimeEmp2);
		System.out.println("Initial Employee Details: ");
		payrollSystem.displayEmployees();
		System.out.println("Removing Employees! ");
		payrollSystem.removeEmployee(2);
		System.out.println("Remaining Employee Details: ");
		payrollSystem.displayEmployees();
	}

}
