package n;

public class Area{
	int length;
	int breadth;
 void setDim(int length,int breadth){
	 this.length=length;
	 this.breadth=breadth;
	 
 }
 int getArea(){
	 int area=length*breadth;
	 return area;
 }
public static void main(String[] args) {
	 Area a1=new Area();
	  a1.setDim(10,4);
	  System.out.println("Area of Rectangle is: "+a1.getArea());
	 
}
 
}
