package curs11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.*;
import java.util.Properties;
import java.util.*;
import java.nio.*;
import java.nio.file.*;
public class TextFileProcessor {
	
	public void writeFile(String textToWrite) {
		try {
		FileWriter fileWriter = new FileWriter("file.txt");
		fileWriter.write(textToWrite);
		System.out.println("successully wroted");
		fileWriter.close();
				
	}catch (IOException e){
		e.printStackTrace();
	}
}
// read txt file
	public void readFile() throws IOException {
		File obj = new File("file.txt");
		try {
		Scanner scan =new Scanner (obj);
		while(scan.hasNext()) {
			String text = scan.nextLine();
			System.out.println(text);
		}
		scan.close();
		}catch (IOException e){
			e.printStackTrace();
		}	
				
}
	//append
	public void updateFile(String textToWrite)  {
		try {
		FileWriter fileWriter = new FileWriter("file.txt",true);  // to append
		fileWriter.write(textToWrite);
		fileWriter.close();
				
	}catch (IOException e){
		e.printStackTrace();
	}
}
	
	public void deleteFromFile(String deleteText, String textToReplace) throws IOException  {
		//String data ="";
		String data = new String(Files.readAllBytes(Paths.get("file.txt")));  // metoda asta de citire din fiesier nu e recomandata, este  doar pt exemple
		try {
		FileWriter fileWriter = new FileWriter("file.txt");  // to append
		data = data.replaceAll(deleteText,textToReplace);
		fileWriter.write(data);
		fileWriter.close();
				
	}catch (IOException e){
		e.printStackTrace();
	}
}
}
