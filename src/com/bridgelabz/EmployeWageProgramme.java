package com.bridgelabz;

public class EmployeWageProgramme {

	static final int WAGEPERHOUR = 20;
	static final int FULLDAYHOURS = 8;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

		int present = 1;
		int value = (int) ((Math.random() * 10) % 2);
		if (value == present) {
			System.out.println("Employee is present");
			int employeewage = WAGEPERHOUR * FULLDAYHOURS;
			System.out.println("Employeewage is: " + employeewage);
		} else
			System.out.println("Employee is Absent+ No Wage");
	}
}
