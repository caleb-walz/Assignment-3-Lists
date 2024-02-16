public class AList implements BookList {

	private Book[] array;
	private int size;

	public AList() {
		size = 0;
		array = new Book[5];
	}

	@Override
	public void listAdd(Book p) {
		if (size >= array.length) {
			Book[] newArray = new Book[array.length * 2];
			for (int i = 0; i < size; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
		}
		array[size] = p;
		size++;
	}

	@Override
	public Book listGet(int pos) {
		if (pos < 0 || pos >= size) return null;
		return array[pos];
	}

	@Override
	public void listRemove(int pos) {
		if (pos < 0 || pos >= size) return;
		if (pos == size - 1) {
			size--;
		} else {
			for (int i = pos; i < size; i++) {
				array[i] = array[i + 1];
			}
			size--;
		}
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		if (size == 0) return "Empty List";
		String list = "";
		for (int i = 0; i < size; i++) {
			list += array[i] + "\n";
		}
		return list.substring(0, list.length() - 1); // remove "\n" at end of String
	}

}
