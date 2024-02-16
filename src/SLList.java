public class SLList implements BookList {

	private SLNode head, tail;
	private int size;

	public SLList() {
		size = 0;
	}

	@Override
	public void listAdd(Book p) {
		SLNode node = new SLNode(p, null);
		if (size == 0) {
			head = tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
		size++;
	}

	private SLNode getNode(int pos) {
		if (pos < 0 || pos >= size) return null;
		SLNode node = head;
		for (int i = 0; i < pos; i++) {
			node = node.getNext();
		}
		return node;
	}

	@Override
	public Book listGet(int pos) {
		SLNode node = getNode(pos);
		if (node == null) return null;
		return node.getData();
	}

	@Override
	public void listRemove(int pos) {
		if (pos < 0 || pos >= size) return;
		SLNode prev = getNode(pos - 1);
		if (prev == null) { // removing head
			SLNode next = head.getNext();
			head = next;
			if (next == null) tail = null; // removed last item of list
		} else {
			SLNode next = prev.getNext().getNext();
			prev.setNext(next);
			if (next == null) tail = prev; // removed tail
		}
		size--;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		if (size == 0) return "Empty List";
		String list = "";
		SLNode node = head;
		for (int i = 0; i < size; i++) {
			list += node.getData().toString() + "\n";
			node = node.getNext();
		}
		return list.substring(0, list.length() - 1); // remove "\n" at end of String
	}

}
