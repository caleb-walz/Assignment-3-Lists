import generic.GenericAList;
import generic.GenericDLList;
import generic.GenericList;
import generic.GenericSLList;

import java.util.Random;

public class Assignment3 {

	public static void testBookList(BookList list) {
		Book book1 = new Book("Black Clover", "Yuki Tabata", 20.49);
		Book book2 = new Book("Wireless Networks", "Anke Berr", 14.99);
		Book book3 = new Book("Creme Waffles for Dummies", "Piro Lane", 24.79);

		System.out.println(list.toString());
		list.listAdd(book1);
		list.listAdd(book2);
		list.listAdd(book3);
		list.listAdd(book2);
		System.out.println(list.toString());
		System.out.println("At index 2: " + list.listGet(2));
		System.out.println("Size: " + list.getSize());
		System.out.println("Adding 3 elements");
		for (int i = 0; i < 3; i++) list.listAdd(book3);
		System.out.println("Size: " + list.getSize());
		System.out.println(list.toString());
		list.listRemove(3);
		System.out.println("Removed at index 3");
		System.out.println(list.toString());
	}

	public static void testGenericListWithBooks(GenericList<Book> list) {
		Book book1 = new Book("Black Clover", "Yuki Tabata", 20.49);
		Book book2 = new Book("Wireless Networks", "Anke Berr", 14.99);
		Book book3 = new Book("Creme Waffles for Dummies", "Piro Lane", 24.79);

		System.out.println(list.toString());
		list.listAdd(book1);
		list.listAdd(book2);
		list.listAdd(book3);
		list.listAdd(book2);
		System.out.println(list.toString());
		System.out.println("At index 2: " + list.listGet(2));
		System.out.println("Size: " + list.getSize());
		System.out.println("Adding 3 elements");
		for (int i = 0; i < 3; i++) list.listAdd(book3);
		System.out.println("Size: " + list.getSize());
		System.out.println(list.toString());
		list.listRemove(3);
		System.out.println("Removed at index 3");
		System.out.println(list.toString());
	}

	public static void testGenericListWithInts(GenericList<Integer> list) {
		System.out.println(list.toString());
		list.listAdd(11);
		list.listAdd(15);
		list.listAdd(3);
		list.listAdd(92);
		System.out.println(list.toString());
		System.out.println("At index 2: " + list.listGet(2));
		System.out.println("Size: " + list.getSize());
		System.out.println("Adding 3 elements");
		for (int i = 0; i < 3; i++) list.listAdd(new Random().nextInt(100));
		System.out.println("Size: " + list.getSize());
		System.out.println(list.toString());
		list.listRemove(3);
		System.out.println("Removed at index 3");
		System.out.println(list.toString());
	}

	public static void testGenericListWithStrings(GenericList<String> list) {
		System.out.println(list.toString());
		list.listAdd("Hello");
		list.listAdd("Hola");
		list.listAdd("Bonjour");
		list.listAdd("Hallo");
		System.out.println(list.toString());
		System.out.println("At index 2: " + list.listGet(2));
		System.out.println("Size: " + list.getSize());
		System.out.println("Adding 3 elements");
		for (int i = 0; i < 3; i++) list.listAdd("New item #" + i);
		System.out.println("Size: " + list.getSize());
		System.out.println(list.toString());
		list.listRemove(3);
		System.out.println("Removed at index 3");
		System.out.println(list.toString());
	}

	public static void main(String[] args) {
		System.out.println("Testing AList");
		AList booksAList = new AList();
		testBookList(booksAList);
		System.out.println();

		System.out.println("Testing SLList");
		SLList booksSLList = new SLList();
		testBookList(booksSLList);
		System.out.println();

		System.out.println("Testing DLList");
		DLList booksDLList = new DLList();
		testBookList(booksDLList);
		System.out.println();

		System.out.println("Testing GenericAList");
		System.out.println("GenericAList<Book>:");
		GenericAList<Book> genBooksAList = new GenericAList<>();
		testGenericListWithBooks(genBooksAList);
		System.out.println("GenericAList<Integer>:");
		GenericAList<Integer> genIntAList = new GenericAList<>();
		testGenericListWithInts(genIntAList);
		System.out.println("GenericAList<String>:");
		GenericAList<String> genStringAList = new GenericAList<>();
		testGenericListWithStrings(genStringAList);
		System.out.println();

		System.out.println("Testing GenericSLList");
		System.out.println("GenericSLList<Book>:");
		GenericSLList<Book> genBooksSLList = new GenericSLList<>();
		testGenericListWithBooks(genBooksSLList);
		System.out.println("GenericSLList<Integer>:");
		GenericSLList<Integer> genIntSLList = new GenericSLList<>();
		testGenericListWithInts(genIntSLList);
		System.out.println("GenericSLList<String>:");
		GenericSLList<String> genStringSLList = new GenericSLList<>();
		testGenericListWithStrings(genStringSLList);
		System.out.println();

		System.out.println("Testing GenericDLList");
		System.out.println("GenericDLList<Book>:");
		GenericDLList<Book> genBooksDLList = new GenericDLList<>();
		testGenericListWithBooks(genBooksDLList);
		System.out.println("GenericDLList<Integer>:");
		GenericDLList<Integer> genIntDLList = new GenericDLList<>();
		testGenericListWithInts(genIntDLList);
		System.out.println("GenericDLList<String>:");
		GenericDLList<String> genStringDLList = new GenericDLList<>();
		testGenericListWithStrings(genStringDLList);
	}

}
