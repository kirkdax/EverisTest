package operations;

import model.Computer;

public class Helper {

	public static void addRam (Computer c, int ramToAdd) {
		c.setRam(c.getRam() + ramToAdd);
	}
	
	public static void substractRam (Computer c, int ramToSubstract) {
		c.setRam(c.getRam() - ramToSubstract);
	}
	
}
