package hw1;

import java.util.HashMap;

public class DestObserver implements Observer {
	public String observerName;
	HashMap<LibraryBook, LBState> observing = new HashMap<LibraryBook, LBState>();
	
	public DestObserver(String s1) {
		observerName = s1;
		//System.out.println(this.observerName + " is observing the source");
	}

	@Override
	public void update(LibraryBook libraryBook) {
		//newLibraryBook has new state
		System.out.println(this.observerName + " OBSERVED " + libraryBook.bookName + " REACHING STATE: " + libraryBook.lbState);
		observing.put(libraryBook, libraryBook.lbState);
	}
	
	public String toString() {
		return observerName;
	}
}
