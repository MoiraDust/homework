
public class Circle {
	private double radius;
	
	public Circle() {
		radius = 1;
	}
	
	public Circle(double Radius) {
		radius = Radius;
	}
	
	public double calArea() {
		double area = radius*radius*3.14;
		return area;
	}
	
	public double calPer() {
		double per = 2*radius*3.14;
		return per;
	}

}
