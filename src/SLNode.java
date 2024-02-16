public class SLNode {

	private Book data;
	private SLNode next;

	public SLNode(Book data, SLNode next) {
		this.data = data;
		this.next = next;
	}

	public Book getData() {
		return data;
	}

	public SLNode getNext() {
		return next;
	}

	public void setNext(SLNode next) {
		this.next = next;
	}
}
