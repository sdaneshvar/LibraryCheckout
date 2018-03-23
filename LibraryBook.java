package hw1;

import java.util.*;

import hw1.LBState;
import hw1.Observer;

public class LibraryBook {
	// Stores LibraryBook's current state
	LBState lbState;
	List<Observer> observers = new ArrayList<Observer>();
	//HashMap<String, SourceObserver> observerHashMap = new HashMap<String, SourceObserver>();
	//HashMap<Observers> observerHash = new HashMap();
	// Initialize variables
	String bookName;
	
	// LibraryBook constructor 
	public LibraryBook (String newName) {
		bookName = newName;
		// First state of LibraryBook is set to Shelved
		setLibraryBookState(isShelved.getInst());
		
	}
	
	// Change LibraryBook's state
	void setLibraryBookState (LBState newlbState) {
		lbState = newlbState;
		Notify();
	}

	// Pass along to new state
	public void shelf() {
		lbState.shelf(this); 
	}
		
	public void borrow() {
		lbState.borrow(this);
	}
		
	public void extend() {
		lbState.extend(this);
	}
		
	public void returnBook() {
		lbState.returnBook(this);
	}
	
	public void attach(Observer observer) {
//		observerHashMap.put(observer.observerName, observer);
		observers.add(observer);
		System.out.println(observer.toString() + " is now watching " + this.bookName);
	}
	
	public void detach(Observer observer) {
//		observerHashMap.remove(observer.observerName);
		if (observers.contains(observer)) {
			observers.remove(observer);
			System.out.println(observer.toString() + " is no longer watching " + this.bookName);
		}
	}
	
	public void Notify() {
		for (Observer obs : observers) {
			obs.update(this);
		}
	}
	
}
