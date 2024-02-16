package generic;

public class GenericDLNode<T> {

	private T data;
	private GenericDLNode<T> prev, next;

	public GenericDLNode(T data, GenericDLNode<T> prev, GenericDLNode<T> next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public GenericDLNode<T> getPrev() {
		return prev;
	}

	public void setPrev(GenericDLNode<T> prev) {
		this.prev = prev;
	}

	public GenericDLNode<T> getNext() {
		return next;
	}

	public void setNext(GenericDLNode<T> next) {
		this.next = next;
	}
}
