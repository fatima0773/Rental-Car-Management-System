package db_project;

import java.util.concurrent.ThreadLocalRandom;

public class IDGenerator {
	private String ID;
	public IDGenerator() {
		this.ID = "";
	}
	public String generateID(String identifier) {
		int value = ThreadLocalRandom.current().nextInt(100, 1000);
		this.ID +=identifier;
		ID+=value;
		return ID;
	}
	
}
