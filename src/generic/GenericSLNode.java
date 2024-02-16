package generic;

public class GenericSLNode<T> {

	private T data;
	private GenericSLNode<T> next;

	public GenericSLNode(T data, GenericSLNode<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public GenericSLNode<T> getNext() {
		return next;
	}

	public void setNext(GenericSLNode<T> next) {
		this.next = next;
	}
}
