package kr.hs.dgsw.java.dept1.d0615;

public class Generic<T, S> {
	
private T value;
	
	private S id;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public S getId() {
		return id;
	}
	
	public void setId(S id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		Generic<String, Integer> generic = new Generic<String, Integer>();
		generic.setValue("Korea");

		Generic<Integer, Integer> generic1 = new Generic<Integer, Integer>();
		generic1.setValue(123);

	}
}
