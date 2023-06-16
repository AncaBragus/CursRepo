package curs11;

import java.io.IOException;

public class TestPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertiesFileProcessor obj = new PropertiesFileProcessor();
		obj.writePropertiesFile();
		obj.readPropertiesFile("user");
		obj.readPropertiesFile("pass");
		obj.readPropertiesFile("env");
		obj.updatePropertiesFile("user","u1");
		obj.deleteFromFile("email");
	}

}
