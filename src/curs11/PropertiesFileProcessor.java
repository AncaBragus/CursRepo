package curs11;

import java.io.*;
import java.util.Properties;
public class PropertiesFileProcessor {

	public void writePropertiesFile() throws IOException {
		try {
		OutputStream outputstream = new FileOutputStream("test.properties");
		Properties propFile =new Properties();
		propFile.setProperty("user", "testuser");
		propFile.setProperty("pass", "testpass");
		propFile.setProperty("env", "testenv");
		propFile.setProperty("email", "testemail");
		propFile.store(outputstream, "am salvat fisier prop");
		outputstream.close();
				
	}catch (FileNotFoundException e){
		e.printStackTrace();
	}
}
	
	public void readPropertiesFile(String key) {
		
		try{
			FileInputStream inputStream = new FileInputStream("test.properties");
			Properties prop =new Properties();
			prop.load(inputStream);
			
			String value = prop.getProperty(key);
			System.out.println(value);
			inputStream.close();
			}catch( IOException e) {
			e.printStackTrace();
			}
	}

public void updatePropertiesFile(String key, String value) {
		Properties prop =new Properties();
		try{
			FileInputStream inputStream = new FileInputStream("test.properties");
			prop.load(inputStream);
		}catch(IOException  e) {
			e.printStackTrace();
		}
		
		try {
			OutputStream output = new FileOutputStream("test.properties");
			prop.setProperty(key, value);
			prop.store(output, null);
		}catch (IOException e){
			e.printStackTrace();
		}
	}

public void deleteFromFile(String key) {
	Properties prop =new Properties();
	try{
		FileInputStream inputStream = new FileInputStream("test.properties");
		prop.load(inputStream);
	}catch(IOException  e) {
		e.printStackTrace();
	}
	
	try {
		OutputStream output = new FileOutputStream("test.properties");
		prop.remove(key);
		prop.store(output, null);
		
	}catch (IOException e){
		e.printStackTrace();
	}
	
	
}
}

