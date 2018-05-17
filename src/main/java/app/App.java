package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.util.MemoryInitializer;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		initializeMemory();
		SpringApplication.run(App.class, args);
	}

	public static void initializeMemory() {

		System.out.println("initializeMemory...");

		if (AppConfiguration.getInstance().getStorageType() == 1) {
			MemoryInitializer.initializeMemoryBasicData();
		}
	}

}

// This class has to be in a package, not in "default package"
// and controllers must be below it
