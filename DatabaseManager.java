package hw1;

public class DatabaseManager {

	// One and only instance of DatabaseManager
	// Static so object is available globally
	private static DatabaseManager onlyInstance = null;
	
	// Lazy instantiation of DatabaseManager instance: instance only created when called
	public static DatabaseManager TheDatabaseManager() {
		
		// If instance has not been created yet, call private constructor
		if (onlyInstance == null) {
			onlyInstance = new DatabaseManager();
			System.out.println("Instance Created");
		}
		// Instance already created, returned singleton instance
		else {
			System.out.println("Previously Created instance returned");
		}
		
		return onlyInstance;
	}
	
}
