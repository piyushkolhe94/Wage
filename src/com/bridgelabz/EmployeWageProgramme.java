package com.bridgelabz;

public class EmployeWageProgramme {

	static final int WAGEPERHOUR = 20;
	static final int FULLDAYHOURS = 8;
	static final int HALFDAYHOURS = 4;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

		int fulldaypresent = 1;
		int halfdaypresent = 2;
		int value = (int) ((Math.random() * 10) % 3);

		if (value == fulldaypresent) {
			System.out.println("Employee is fulldaypresent");
            int employeewage = WAGEPERHOUR * FULLDAYHOURS;
			System.out.println("Employeewage is: " + employeewage);

		} else if (value == halfdaypresent) {
			System.out.println("Employee is halfdaypresent");
            int employeewage = WAGEPERHOUR * HALFDAYHOURS;
			System.out.println("Employeewage is: " + employeewage);
			
       } else {
    	   
			System.out.println("Employee is Absent+ No Wage");
		}
	}
}
