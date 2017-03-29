package new1;

public class Fanxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utils<worker> u = new Utils<worker>();
		u.setObj(new worker());
		worker worker =u.getObj();
		
	}

}

class worker{
	
}

class Utils<Q>{
	private Q q;
	
	public Q getObj() {
		return q;
	}
	
	public void setObj(Q q) {
		this.q = q;
	}
}
