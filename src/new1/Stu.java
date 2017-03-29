package new1;

import java.util.ArrayList;
import java.util.Iterator;

public class Stu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Person> a1 = new ArrayList<Person>();
		a1.add(new Person("abc1"));
		a1.add(new Person("d132133"));
		a1.add(new Person("e1"));
		a1.add(new Person("f1"));
		
		printColl(a1);
	}
	public static void printColl(ArrayList<? extends Person> a1){
		Iterator<? extends Person> it = a1.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}


class Person{
	private String name ;
	Person(String name){
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
}

class Student extends Person{
		Student(String name ){
			super(name);
}
}

