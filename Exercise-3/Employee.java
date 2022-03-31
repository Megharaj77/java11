package st3;
import java.util.Scanner;
public class Employee {
int eid;
String ename;
String add;
Employee(int eid,String ename,String add){
	this.eid=eid;
	this.ename=ename;
	this.add=add;
}
void displayEmployee(){
	System.out.println("EID= "+eid+" Ename= "+ename+" Address= "+add);
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER EID");
	int id=scan.nextInt();
	System.out.println("ENTER Name");
	String name=scan.next();
	System.out.println("ENTER Address");
	String add=scan.next();
	scan.close();
	Employee emp=new Employee(id,name,add);
	emp.displayEmployee();
}
}
