package hw1;

class isShelved implements LBState {
	
	// Initialize instances
	private static isShelved shelvedInst = null;
	static LibraryBook libraryBook;
	
	// isShelved constructor
	public isShelved() {}
	
	// isShelved constructor
	public isShelved(LibraryBook newLibraryBook) {
		libraryBook = newLibraryBook;
	}

	// Create and return Shelved instance
	public static isShelved getInst() {
		if (shelvedInst == null) {
			System.out.println("Shelved Instance Created");
			shelvedInst = new isShelved();
		}
		return shelvedInst;
	}

	@Override
	public void shelf(final LibraryBook libraryBook){ 
		try {
			throw new NotAllowedException();
		} catch (NotAllowedException e) {
			System.out.println(e + e.printException("shelf", toString()));
		}
	}

	@Override
	public void borrow(final LibraryBook libraryBook) {
		LBState temp = isOnLoan.getInst();
		System.out.println("Leaving State " + shelvedInst.toString() + " for State OnLoan");
		libraryBook.setLibraryBookState(temp);
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
		return "Shelved";
	}

}