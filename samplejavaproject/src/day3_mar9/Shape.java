package day3_mar9;

abstract class Shape1{
	int length;
	int breadth;
	double radius;
	Shape1(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	Shape1(double radius){
		this.radius=radius;
	}
	abstract void area();
}


class Rectangle extends Shape1{
	Rectangle(int length, int breadth) {
		super(length, breadth);
	}
	void area() {
		System.out.println("Area of Rectangle: "+(this.length*this.breadth));
	}
}


class Circle extends Shape1{

	Circle(double radius) {
		super(radius);
	}
	void area() {
		System.out.println("Area of Circle: "+(3.14159*this.radius*this.radius));
	}
}


public class Shape {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(5,4);
		r.area();
		Circle c = new Circle(5.4);
		c.area();
	}

}