package st4;
import java.util.ArrayList;

class ArrayListExample{
 public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<>();
	a.add("shirt");
	a.add("belt");
	a.add("tie");
	System.out.println(a);
	a.add(2,"pant");
	System.out.println(a);
	if(a.contains("pant")){
		a.remove("pant");
		System.out.println(a);
	}
}
}
