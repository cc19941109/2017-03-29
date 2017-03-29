package new1;

import java.util.LinkedList;

/*LinkList  特有方法
 * addFirst()  addLast()//添加
 * offer
 * getFirst()  getLast() //获取元素，不删除
 * peek
 * removeFirst()  removeLast()//获取元素，并删除
 * poll  若没有返回 NULL
 * */


public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList link	= new LinkedList<>();
		link.add("3dsa");
		link.add("sdaa");
		link.add("2a");
		link.add("sa");
		link.add("sa1");
		
		link.addFirst("11niohao");//在头部插入
		
		sop(link);
		sop(link.getFirst());
		sop(link.removeFirst());
		sop(link.removeFirst());
		sop(link);
		while(!link.isEmpty()){
			link.pollFirst();
			sop(link);
		}
	}
	
	public  static void  sop(Object obj) {
		System.out.println(obj);
		
	}

}
