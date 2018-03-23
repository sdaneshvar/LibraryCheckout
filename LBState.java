package hw1;

public interface LBState {
	// State functions to move from one state to another
	public void shelf(LibraryBook libraryBook);
	public void borrow(LibraryBook libraryBook);
	public void extend(LibraryBook libraryBook);
	public void returnBook(LibraryBook libraryBook);
}