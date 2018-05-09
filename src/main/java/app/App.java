package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.util.MemoryInitializer;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		MemoryInitializer.initializeMemoryBasicData();
		SpringApplication.run(App.class, args);
	}

}

// This class has to be in a package, not in "default package"
// and controllers must be below it
