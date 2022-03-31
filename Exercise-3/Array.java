package st3;

public class Array {
 public static void main(String[] args) {
	 int[] a1={2,3,7,16,3};
	 int sum=0;
	 for(int a:a1){
		sum=sum+a;
	 }
	 double avg=sum/a1.length;
	System.out.println("Avge of The Array is= "+avg);
}
}