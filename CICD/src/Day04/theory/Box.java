package Day04.theory;

public class Box<T> {
	private T value;
	
	public Box(T value) {
		this.value = value;
	}
	
	T getValue() {
		return this.value;
	}
	
	void setValue(T newValue) {
		this.value = newValue;
	}
}
