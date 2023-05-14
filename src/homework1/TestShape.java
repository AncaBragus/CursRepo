package homework1;

public class TestShape {
	
	public static void main(String[] args) {
		Shape patrat = new Shape(8);
		System.out.println("The area of the square is : " + patrat.calculateSquareArea());
		Shape dreptunghi = new Shape (4,2);
		System.out.println("The area of the rectangle is : " + dreptunghi.calculateRectangleArea());
		Shape cerc = new Shape (3.0);
		System.out.println("The area of the circle is : " + cerc.radius * cerc.radius * Math.PI);
	}
	
}