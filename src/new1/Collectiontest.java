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
		
		
		//������
	/*	Iterator i = a1.iterator();
		while(i.hasNext()){
		sop(i.next());
		}
		*/
		//����
		for(Iterator x = a1.iterator();x.hasNext();)
		{
			sop(x.next());
		}
	/*	
		
		//ȡ������������ͬԪ��
		a1.retainAll(a2);
		sop(a1);
		sop(a2);
		//ȥ���������浽a1
		a1.removeAll(a2);
		sop(a1);
		sop(a2);
		
		//a1.addAll(2,a1);
		//��ӡԪ��
		sop(a1);
		//��ȡ���������ϳ���
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




