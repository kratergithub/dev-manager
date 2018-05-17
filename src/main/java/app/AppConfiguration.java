package app;

//Singleton
public class AppConfiguration {

	private static AppConfiguration instance = null;

	private int storageType = 1;
	
	protected AppConfiguration() {
		// Exists only to defeat instantiation.
	}

	public static AppConfiguration getInstance() {
		if (instance == null) {
			instance = new AppConfiguration();
		}
		return instance;
	}

	public int getStorageType() {
		return storageType;
	}

	public void setStorageType(int storageType) {
		this.storageType = storageType;
	}
	
	
}
