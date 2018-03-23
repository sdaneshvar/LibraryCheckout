package hw1;

class isReturned implements LBState {
	
	// Initialize instances
	private static isReturned returnedInst = null;
	static LibraryBook libraryBook;
		
	// isShelved constructor
	private isReturned() {}
		
	// isShelved constructor
	public isReturned(LibraryBook newLibraryBook) {
		libraryBook = newLibraryBook;
	}
		
	// Create and return Shelved instance
	public static isReturned getInst() {
		if (returnedInst == null) {
			System.out.println("Returned Instance Created");
			returnedInst = new isReturned();
		}
		return returnedInst;
	}
	
	@Override
	public void shelf(final LibraryBook libraryBook) {
		LBState temp = isShelved.getInst();
		System.out.println("Leaving State " + toString() + " for State Shelved");
		libraryBook.setLibraryBookState(temp);
		//notify();
	}

	@Override
	public void borrow(final LibraryBook libraryBook) {
		try {
			throw new NotAllowedException();
		} catch (NotAllowedException e) {
			System.out.println(e + e.printException("borrow", toString()));
		}
	}

	@Override
	public void extend(final LibraryBook libraryBook) {
		try {
			throw new NotAllowedException();
		} catch (NotAllowedException e) {
			System.out.println(e + e.printException("extend", toString()));
		}
	}

	@Override
	public void returnBook(final LibraryBook libraryBook) {
		try {
			throw new NotAllowedException();
		} catch (NotAllowedException e) {
			System.out.println(e + e.printException("returnBook", toString()));
		}
	}
	
	public String toString() {
		return "Returned";
	}

}