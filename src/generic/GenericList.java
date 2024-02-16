package generic;

public interface GenericList<T> {

	public void listAdd(T p);
	public T listGet(int pos);
	public void listRemove(int pos);
	public int getSize();

}
