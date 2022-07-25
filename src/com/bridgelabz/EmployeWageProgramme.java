package com.bridgelabz;

public class EmployeWageProgramme {

	static final int WAGEPERHOUR = 20;
	static final int FULLDAYHOURS = 8;
	static final int HALFDAYHOURS = 4;
	static final int FULLDAYPRESENT = 1;
	static final int HALFDAYPRESENT = 2;
	static final int NO_OF_WORKING_DAYS = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
        
		int employeeHrs = 0;
		int employeeWage = 0;
		int totalWages = 0;
		int fulldaypresent = 1;
		int halfdaypresent = 2;
		
	    for(int day=0; day<=NO_OF_WORKING_DAYS; day++){
	   	int value = (int) ((Math.random() * 10) % 3);
		switch (value) {
        case HALFDAYPRESENT:
        	employeeHrs = 4;
            break;
        case FULLDAYPRESENT:
        	employeeHrs= 8;
            break;
        default:
        	employeeHrs = 0;
    }
         employeeWage  = employeeHrs * WAGEPERHOUR ;
         System.out.println("emp wage:" + employeeWage );
         
         totalWages+=employeeWage;
         System.out.println("total wages=>" +totalWages);

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
}