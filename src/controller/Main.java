package controller;

import model.Computer;
import operations.Helper;

public class Main {

	public static void main(String[] args) {

		Computer c = new Computer("Nvidia", 16, "Ryzen5", "AM4", 1024);
		
		System.out.println(c.toString());
		System.out.println("Meto RAM");
		Helper.addRam(c, 32);
		System.out.println(c.toString());
		System.out.println("Quito RAM");
		Helper.substractRam(c, 2);
		System.out.println(c.toString());
		
	}

}
