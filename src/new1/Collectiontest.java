package new1;
import java.util.*;

public class Collectiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1  = new ArrayList();
	
		a1.add("java01");
		a1.add("java02");
		a1.add("java03");
		a1.add("java04");
		a1.add(3);
		
		ArrayList a2  = new ArrayList();
		
		a2.add("java02");
		a2.add("java06");
		a2.add("java07");
		a2.add("java08");
		a2.add(3);
		
		
		//迭代器
	/*	Iterator i = a1.iterator();
		while(i.hasNext()){
		sop(i.next());
		}
		*/
		//或者
		for(Iterator x = a1.iterator();x.hasNext();)
		{
			sop(x.next());
		}
	/*	
		
		//取交集，保留相同元素
		a1.retainAll(a2);
		sop(a1);
		sop(a2);
		//去掉交集，存到a1
		a1.removeAll(a2);
		sop(a1);
		sop(a2);
		
		//a1.addAll(2,a1);
		//打印元素
		sop(a1);
		//获取个数，集合长度
		sop("size"+a1.size());
		//delete
		a1.remove("java02");
		sop(a1);
		a1.clear();
		sop(a1);
		//judge
		sop(a1.contains(3));
		sop(a1.isEmpty());
		
		
		*/
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}

	
	
}




