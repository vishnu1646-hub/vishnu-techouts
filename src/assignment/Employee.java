package assignment;

public class Employee {
	private String employeeName;
	private int rating;
	private int startYear;
	public Employee(int rating, int startYear,String employeeName) {
		this.rating = rating;
		this.startYear = startYear;
		this.employeeName=employeeName;
	}
	public String getEmployeeDetails(){
		return "employee name: "+this.employeeName+", rating: "+this.rating+", start year: "+this.startYear;
	}
	

}
