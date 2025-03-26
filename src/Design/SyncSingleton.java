// Synchronized Singleton Class

package Design;
public class SyncSingleton {
	
	// Lazy Initialization Start 
	
	private static SyncSingleton INSTANCE;

    private SyncSingleton() {}
    
	public static synchronized SyncSingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SyncSingleton();
		}
		return INSTANCE;
	}
	
	// Lazy Initialization End

	// Double Checked Locking Start 
	/*
	private static volatile SyncSingleton INSTANCE;

    private SyncSingleton() {}
    
	public static SyncSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized(SyncSingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new SyncSingleton();
				}
			}
		}
		return INSTANCE;
	}
	*/
	// Double Checked Locking End
	
	// Bill Pugh Singleton Start
	/*
    private SyncSingleton() {}
    
	private static class SingletonHelper {
		private static final SyncSingleton INSTANCE = new SyncSingleton();
	}
	
	public static SyncSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
	*/
	// Bill Pugh Singleton End

	// Enum Singleton Start
	/*
	public enum SyncSingletonEnum {
		INSTANCE;

		public void doSomething() {
			System.out.println("Singleton using enum");
		}
	}
	*/
	// Enum Singleton End

	public static void main(String[] args) {
		SyncSingleton instance1 = SyncSingleton.getInstance();
		SyncSingleton instance2 = SyncSingleton.getInstance();
		System.out.println(instance1 == instance2); // true
	}
}
