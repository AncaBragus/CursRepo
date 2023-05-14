package homework1;

public class Shape {
	//variables
	public int lenght;
	public int widht;
	public double radius;
	//3 constructors
	public Shape(int lenght) {
		this.lenght = lenght;
	}
	public Shape(int lenght, int width) {
		this.lenght = lenght;
		this.widht = width;
	}
	public Shape(double radius){
		this.radius =  radius;
	}
	//2 methods
	public int calculateSquareArea() {
		return lenght * lenght;
	}
	public int calculateRectangleArea (){
		return lenght * widht;
	}

}