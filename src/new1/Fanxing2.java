package new1;

public class Fanxing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	demo<String> demo = new demo<String>();
		///demo.show("srer");
	//	demo.print("w213");
		
		
		demo<Integer> demo1 = new demo<Integer>();
		demo1.show(121);
		demo1.print(44);
		
		demo1 d = new demo1();
		d.show(1);
		d.show("dasdasd");
	}

}

class demo1<X>{
	public <T> void show (T t){
		System.out.println("show  "+t);
	}
	public void print(X x) {
		System.out.println(x);
	}
	
	public static <W> void p(W w){
	
}


class demo<T>
{
	public void show(T t){
		System.out.println("show  "+t);
	}
	public void print(T t){
		System.out.println("print  "+t);
	}
}