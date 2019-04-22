import java.util.ArrayList;
import java.time.LocalDate;
import java.util.*;

class Person{
	private String name, SSN;
	private LocalDate hireDate;
	
	
	public void setName(String n) {
		this.name=n;
	}
	
	public String getName() {
		return this.name;
	}
	

	public void setSSN(String s) {
		this.SSN=s;
	}
	
	public String getSSN() {
		return this.SSN;
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
    	System.out.println("What are the players names?");//prompts players for their names
		String nameStore = input.next(); 
		EmployeeList.add(new Employee(nameStore)); //Create an ar
    }
	System.out.println("Please enter your name, social security number, address, position title, salary and hireDate: ");	
	
	Employee.setName("Brandon");	
	
		}
    
	}

}
