package curs2;

public class Rectangle {
	//variable
	private int lenght;
	private int width;
	//constructor
	public Rectangle(int lenght, int width) {
		this.lenght = lenght;
		this.width = width;
	}
	//metoda
	public int calculateArea() {
		return lenght * width;
	}


}