package generic;

public class GenericDLList<T> implements GenericList<T> {

	private GenericDLNode<T> head, tail;
	private int size;

	public GenericDLList() {
		size = 0;
	}

	@Override
	public void listAdd(T p) {
		GenericDLNode<T> node = new GenericDLNode<>(p, null, null);
		if (size == 0) {
			head = tail = node;
		} else {
			tail.setNext(node);
			node.setPrev(tail);
			tail = node;
		}
		size++;
	}

	private GenericDLNode<T> getNode(int pos) {
		if (pos < 0 || pos >= size) return null;

		// traverse from the closer end of the list
		if (pos <= size / 2) {
			GenericDLNode<T> node = head;
			for (int i = 0; i < pos; i++) {
				node = node.getNext();
			}
			return node;
		} else {
			GenericDLNode<T> node = tail;
			for (int i = size - 1; i > pos; i--) {
				node = node.getPrev();
			}
			return node;
		}
	}

	@Override
	public T listGet(int pos) {
		GenericDLNode<T> node = getNode(pos);
		if (node == null) return null;
		return node.getData();
	}

	@Override
	public void listRemove(int pos) {
		if (pos < 0 || pos >= size) return;
		GenericDLNode<T> node = getNode(pos);
		if (node.getNext() != null) {
			node.getNext().setPrev(node.getPrev());
		}
		if (node.getPrev() != null) {
			node.getPrev().setNext(node.getNext());
		}
		if (node == head) {
			head = node.getNext();
		}
		if (node == tail) {
			tail = node.getPrev();
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
		GenericDLNode<T> node = head;
		for (int i = 0; i < size; i++) {
			list += node.getData().toString() + "\n";
			node = node.getNext();
		}
		return list.substring(0, list.length() - 1); // remove "\n" at end of String
	}

}
