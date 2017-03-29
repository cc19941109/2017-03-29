package new1;

import java.util.ArrayList;
import java.util.Iterator;

public class FanXingUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		a1.add("as");
		a1.add("df");
		a1.add("gh");
		
		a2.add(1);
		a2.add(2);
		a2.add(3);
		
		printColl(a1);
		printColl(a2);
	}
	
	public static void printColl(ArrayList<?> a1){
		Iterator<?> it = a1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static <T> void printCol(ArrayList<T> a1){
		Iterator<T> it = a1.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}

}
