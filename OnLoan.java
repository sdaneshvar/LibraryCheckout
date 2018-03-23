package hw1;

class isOnLoan implements LBState {
	
	// Initialize instances
	private static isOnLoan onLoanInst = null;
	static LibraryBook libraryBook;
	
	// isShelved constructor
	private isOnLoan() {}
			
	// isShelved constructor
	public isOnLoan(LibraryBook newLibraryBook) {
		libraryBook = newLibraryBook;
	}
			
	// Create and return Shelved instance
	public static isOnLoan getInst() {
		if (onLoanInst == null) {
			System.out.println("OnLoan Instance Created");
			onLoanInst = new isOnLoan();
		}
		return onLoanInst;
	}

	@Override
	public void shelf(final LibraryBook libraryBook) {
		try {
			throw new NotAllowedException();
		} catch (NotAllowedException e) {
			System.out.println(e + e.printException("shelf", toString()));
		}
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
		LBState temp = isOnLoan.getInst();
		System.out.println("Leaving State " + toString() + " for State " + toString());
		if (libraryBook.lbState.toString() != toString()) {
			libraryBook.setLibraryBookState(temp);
		}
	}

	@Override
	public void returnBook(final LibraryBook libraryBook) {
		LBState temp = isReturned.getInst();
		System.out.println("Leaving State " + toString() + " for State Returned");
		libraryBook.setLibraryBookState(temp);
	}
	
	public String toString() {
		return "OnLoan";
	}

}