
public class Box<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		Box<Integer> n = new Box<Integer>();
		Box<String> s = new Box<String>();
		
		n.setT(201);
		s.setT("NSU");
		
		System.out.println(n.getT());
		System.out.println(s.getT());
	}
}
