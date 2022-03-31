package st5;

public class LambdaExpression {
public static void main(String[] args) {
	Addition sum=(x,y)->{
		long addsum=x+y;
		return addsum;
	};
	System.out.println(sum.add(11,23));
}
}
