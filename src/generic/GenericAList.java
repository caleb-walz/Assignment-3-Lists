package generic;

public class GenericAList<T> implements GenericList<T> {

	private Object[] array;
	private int size;

	public GenericAList() {
		size = 0;
		array = new Object[5];
	}

	@Override
	public void listAdd(T p) {
		if (size >= array.length) {
			Object[] newArray = new Object[array.length * 2];
			for (int i = 0; i < size; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
		}
		array[size] = p;
		size++;
	}

	@Override
	public T listGet(int pos) {
		if (pos < 0 || pos >= size) return null;
		return (T) array[pos];
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
