package com.kodewala.Inhiritance2;

class InvalidSalaryException extends Exception{
	public InvalidSalaryException(String message) {
		super(message);
	}
}

class EmployeeService {
	public void setSalary(int salary) throws InvalidSalaryException {
		
		if(salary <=0) {
		throw new InvalidSalaryException("Salary Must be Grether Than Zero");
		}
		
		System.out.println("Salary Updated");
	}
}

public class Q11
{
	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		try {
			es.setSalary(-1222);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
