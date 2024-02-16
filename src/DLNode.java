public class DLNode {

	private Book data;
	private DLNode prev, next;

	public DLNode(Book data, DLNode prev, DLNode next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	public Book getData() {
		return data;
	}

	public DLNode getPrev() {
		return prev;
	}

	public void setPrev(DLNode prev) {
		this.prev = prev;
	}

	public DLNode getNext() {
		return next;
	}

	public void setNext(DLNode next) {
		this.next = next;
	}
}
