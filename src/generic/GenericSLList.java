package generic;

public class GenericSLList<T> implements GenericList<T> {

	private GenericSLNode<T> head, tail;
	private int size;

	public GenericSLList() {
		size = 0;
	}

	@Override
	public void listAdd(T p) {
		GenericSLNode<T> node = new GenericSLNode<>(p, null);
		if (size == 0) {
			head = tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
		size++;
	}

	private GenericSLNode<T> getNode(int pos) {
		if (pos < 0 || pos >= size) return null;
		GenericSLNode<T> node = head;
		for (int i = 0; i < pos; i++) {
			node = node.getNext();
		}
		return node;
	}

	@Override
	public T listGet(int pos) {
		GenericSLNode<T> node = getNode(pos);
		if (node == null) return null;
		return node.getData();
	}

	@Override
	public void listRemove(int pos) {
		if (pos < 0 || pos >= size) return;
		GenericSLNode<T> prev = getNode(pos - 1);
		if (prev == null) { // removing head
			GenericSLNode<T> next = head.getNext();
			head = next;
			if (next == null) tail = null; // removed last item of list
		} else {
			GenericSLNode<T> next = prev.getNext().getNext();
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
		GenericSLNode<T> node = head;
		for (int i = 0; i < size; i++) {
			list += node.getData().toString() + "\n";
			node = node.getNext();
		}
		return list.substring(0, list.length() - 1); // remove "\n" at end of String
	}

}
