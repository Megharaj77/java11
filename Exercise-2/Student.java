package n;

public class Student {
     String name;
     String add;
     public static void main(String[] args) {
		Student std1=new Student();
		Student std2=new Student();
		std1.name="jhon";
		std1.add="Bengaluru";
		std2.name="tom";
		std2.add="Mysore";
		System.out.println("Name="+std1.name+" ADDRESS="+std1.add);
		System.out.println("Name="+std2.name+" ADDRESS="+std2.add);
		
	}
}
