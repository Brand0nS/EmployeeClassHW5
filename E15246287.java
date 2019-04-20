import java.util.ArrayList;
import java.time.LocalDate;

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
}



class Employee extends Person{
	private double salary;
	private String positionTitle;
	
	
}



public class E15246287 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
    ArrayList<String> Employee= new ArrayList<String>();
    
	}

}
