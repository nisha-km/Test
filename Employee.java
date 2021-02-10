package assignment4;

public class Employee {
	
	String firstName;
	String lastName;

	public Employee(String firstName, String lastName) {
		super();
		firstName = firstName;
		lastName = lastName;
		System.out.println("firstName :"+firstName);
		System.out.println("lastName "+lastName);
	}
	


	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public static void main(String[] args) {
		Employee employee1= new Employee("Nisha", "Vaibhav");
		Employee employee2= new Employee("Asha", "Rekha");
		Employee employee3= new Employee("Madhu", "Sandeep");
		
		
		
	}
	

}
