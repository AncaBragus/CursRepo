package curs11;

import java.io.IOException;

public class TestTextFileProcessor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TextFileProcessor obj = new TextFileProcessor();
		obj.writeFile("bla bla bla");
		obj.readFile();
		obj.updateFile("Alt text adaugat");
		obj.deleteFromFile("Alt text adaugat","");
	}

}
