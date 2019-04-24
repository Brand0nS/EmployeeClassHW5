import java.util.ArrayList;
import java.time.LocalDate;
import java.util.*;

class Person{
	private String name;
	private static String SSN;
	private LocalDate hireDate;
	
	
	public void setName(String n) {
		this.name=n;
	}
	
	public String getName() {
		return this.name;
	}
	

	public void setSSN(String s) {
		SSN=s;
	}
	
	public static String getSSN() {
		return SSN;
	}
	
	public LocalDate getHireDate(){
		return this.hireDate;
		}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
}
	

	 class SSNLengthException extends Exception{
		

		    public SSNLengthException(String message) {
		        super(message);
		    }

	}
	 
	 class SSNCharacterException extends Exception{
			

		    public SSNCharacterException(String message) {
		        super(message);
		    }

	}

}

class Address {
	private String address;
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String a) {
		this.address=a;
	}
}

class Employee extends Person{
	Address a = new Address(); 
	private double salary;
	private String positionTitle;
	
	public Employee() {
		a.setAddress("null");
		salary= 0.00;
		positionTitle="null";
	}
	
	public Employee(String n,String SSN, double s, String pos) {
		super.setName(n);
		super.setSSN(SSN);
		salary=s;
		positionTitle=pos;
		
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(double s) {
		this.salary=s;
	}
	
	public String getPosition() {
		return this.positionTitle;
	}
	
	public void setPosition(String s) {
		this.positionTitle=s;
	}
	
}


class EmployeeRecord {
	
	public static boolean isValidSSN(String s) {
		if(s.length()<9) {
			return false;
		}
		
		for(int p=0;p<9;p++) {
			if(!Character.isDigit(s.charAt(p)))
				return false;
		}
		return true;
	}
	
	
}

public class E15246287 extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
	int numOfEmployees=0;
	Scanner input= new Scanner(System.in);		
    ArrayList<Employee> EmployeeList= new ArrayList<Employee>();
    System.out.println("Enter the amount of employees you want: ");
    numOfEmployees=input.nextInt();
    for(int n=0; n < numOfEmployees; n++) {
    	System.out.println("What is the  name of Employee" + numOfEmployees + " ?");
		String nameStore = input.next(); 
		System.out.println("What is the SSN of Employee" + numOfEmployees + " ?");
		String ssnStore= input.next();
		System.out.println("What is the salary of Employee" + numOfEmployees + " ?");
		double salaryStore= input.nextDouble();
		System.out.println("What is the status of Employee" + numOfEmployees + " ?");
		String statusStore= input.next();
		EmployeeList.add(new Employee(nameStore,ssnStore,salaryStore,statusStore)); //Create an ar
                }
	
		}
		
		catch(SSNLengthException e) {
			System.out.println(e.getMessage());
			}
		if(getSSN().length()<9||getSSN().length()>9) {
			throw new SSNLengthException("The length of the Social Security number is invalid. Please"
					+ "try again! ");
		}
      
	}

}
