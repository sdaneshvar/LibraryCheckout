package hw1;

import java.util.HashMap;

public class SourceObserver implements Observer {
	String observerName;
	HashMap<LibraryBook, LBState> observing = new HashMap<LibraryBook, LBState>();
	
	public SourceObserver(String s1) {
		observerName = s1;
		//System.out.println(this.observerName + " is observing the source");
	}

	@Override
	public void update(LibraryBook libraryBook) {
		//newLibraryBook has new state
		if (!observing.containsKey(libraryBook)) {
			System.out.println(this.observerName + " OBSERVED " + libraryBook.bookName + " LEAVING STATE: UNOBSERVED");
		}
		else {
			System.out.println(this.observerName + " OBSERVED " + libraryBook.bookName + " LEAVING STATE: " + observing.get(libraryBook).toString() );
		}
		observing.put(libraryBook, libraryBook.lbState);
	}

	public String toString() {
		return observerName;
	}
	/*@Override
	public void attach(SourceObserver observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detach(SourceObserver observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attach(DestObserver observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detach(DestObserver observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		
	}*/

}
