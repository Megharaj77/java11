package n;

public class Employee2 {
double salary;
int hours;
void getInfo(double salary,int hours){
	this.salary=salary;
	this.hours=hours;
}
void addSal(){
	if(salary<500){
		salary+=10;
	}
}
void addWork(){
	if(hours>6){
		salary+=5;
	}
}
public static void main(String[] args) {
	Employee2 emp=new Employee2();
	emp.getInfo(495, 5);
	emp.addSal();
	emp.addWork();
	System.out.println("Salary of the Employee= "+emp.salary);
}
}
