package st5;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		String designation=" 101";
		Scanner scan = new Scanner(System.in);

		System.out.println("enter your employee ID: ");
		int eid = scan.nextInt();
		System.out.println("enter your name: ");
		String name = scan.next();
		System.out.println("enter your basic salary: ");
		float basicSalary = scan.nextFloat();
		System.out.println("enter your hra: ");
		float hra = scan.nextFloat();
		
		int x = 1;
		while (x != 0) {
			System.out.println("Select the option:\n1. Manager\n2. Assistant Manager: ");
			int option = scan.nextInt();
			
			switch (option) {
				case 1: {
					designation = "Manager";
					x=0;
					break;
				}
				case 2: {
					designation ="Assistant Manager";
					x=0;
					break;
				}
				default: {
					System.out.println("Enter valid option");
				}
			}
		}
		
		
		Employee employee = new Employee(eid, name, basicSalary, hra, designation);
		
		employee.calculateNetSalary();
	}
}
