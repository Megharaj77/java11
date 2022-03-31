package st5;

public class Employee {

	private int employeeID;
	private String employeeName;
	private float basicSalary;
	private float specialAllowance;
	private float hra;
	private float ta;
	private float tax = 2500;
	private float netSalary;
	private String designation;

	public Employee(int employeeID, String employeeName, float basicSalary, float hra, String designation) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.designation = designation;
	}

	public void calculateNetSalary() {

		if (designation == "Manager") {
			ta = (basicSalary/100)*20;
			specialAllowance = 20000;
		} else {
			ta = (basicSalary/100)*15;
			specialAllowance = 12000;
		}
		
		// calculating net salary
		netSalary = basicSalary + hra + specialAllowance + ta - tax;
		System.out.println("The net salary is: " + netSalary);
	}
}
