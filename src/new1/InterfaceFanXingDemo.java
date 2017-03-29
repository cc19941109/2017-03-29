package new1;

interface Inter<T>
{
	void show(T t);
	
}

class aaaa<T> implements Inter<T>{
	public void  show(T t) {
		System.out.println(t);
	}
}

public class InterfaceFanXingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaaa iAaaa = new aaaa();
		iAaaa.show("ssdasd");
	}

}
