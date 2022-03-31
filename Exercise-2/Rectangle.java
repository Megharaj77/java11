package n;

public class Rectangle {
	int length;
	int breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	int Area(){
		int area=length*breadth;
		return area;
	}
	public static void main(String[] args) {
		Rectangle rec1=new Rectangle(10,15);
		System.out.println("Area of rectangle1 is: "+rec1.Area());
		Rectangle rec2=new Rectangle(16,13);
		System.out.println("Area of rectangle1 is: "+rec2.Area());
	}
}
