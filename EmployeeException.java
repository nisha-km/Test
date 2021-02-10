package assignment4;

public class EmployeeException {
	private String firstName;
	private String lastName;

	public EmployeeException(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;

	}
	
	public void validateData(String firstName, String lastName) throws Exception {
		System.out.println(firstName);
		if(firstName==null && lastName==null) {
			throw new NullPointerException("entry missing");
			
		}else if(firstName.length()<3 && lastName.length()<3) {
			throw new Exception("name should be minimum 3 character");
		}else {
			System.out.println("Valid input data");
		}
	}
	//DOne

	public static void main(String[] args) throws Exception {
		EmployeeException emp = new EmployeeException("qwert", "qwert");
		emp.validateData(null, "qw");
	}

}
