package new1;

import java.util.LinkedList;

/*LinkList  ���з���
 * addFirst()  addLast()//���
 * offer
 * getFirst()  getLast() //��ȡԪ�أ���ɾ��
 * peek
 * removeFirst()  removeLast()//��ȡԪ�أ���ɾ��
 * poll  ��û�з��� NULL
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
		
		link.addFirst("11niohao");//��ͷ������
		
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
