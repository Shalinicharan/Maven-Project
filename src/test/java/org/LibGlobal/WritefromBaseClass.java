package org.LibGlobal;

import java.io.IOException;

public class WritefromBaseClass {
	public static void main(String[] args) throws IOException {
		
		BaseClass object = new BaseClass();
		object.writeData("data", 3, 5, "Shalini");
	}

}
