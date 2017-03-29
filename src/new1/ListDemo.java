package new1;
import java.util.*;
/* 
 *List 
 * add(index,elemrnt);
 * addAll(index,Collection);
 * 
 * remove(index);
 * 
 * set(Index,element);
 * 
 * get(index)
 * subList(from,to)
 * listIterator i  = a1.listIterator()
 * hasNext()  hasPrevious();
 * 
 * */



public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 =new ArrayList();
		
		a1.add(1);
		a1.add(2);
		a1.add(33);
		a1.add(324);
		a1.add(5);
		a1.add(45);
		a1.add(135);
		a1.add(310);
		sop(a1);
		
		List sub = a1.subList(1, 3);
		sop(sub);
		//listIterator 列表迭代器(子接口)继承自迭代器。。方法多多了
		//List 集合带角标，所以。。。有那么多方法
		ListIterator listIterator = a1.listIterator();
		while(listIterator.hasNext()){
			Object object  = listIterator.next();
			if(object.equals(45)){
				listIterator.add("nihaoya");
			}
			
		}
		
		
		Iterator iterator = a1.iterator();
		while (iterator.hasNext()){
			Object object = iterator.next();
			
			if(object.equals(310)){
				//a1.add("llalalallla");//不能这么用
				iterator.remove();//310的引用从集合中删除了
			}
			sop(object);
		} 
		sop(a1);
		
		
		/*并发访问的安全隐患
		 * Exception in thread "main" java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at new1.ListDemo.main(ListDemo.java:40)
*/
		
		
		
//		a1.add(1,"ddd");
//		sop(a1);
//			
//		a1.remove(3);
//		sop(a1);
//		
//		a1.set(2, "hahhahah");
//		sop(a1);
//		
//		sop(a1.get(2));
//		for(int x = 0;x<a1.size();x++){
//			System.out.println(a1.get(x));
//		}
//		
//		Iterator iterator = a1.iterator();
//		while(iterator.hasNext()){
//			System.out.println(iterator.next());
//		}
//		System.out.println("------------------------------------");
//		for(Iterator x =a1.iterator();x.hasNext();)
//		{
//			System.out.println(x.next());
//		}
		
		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}

}
