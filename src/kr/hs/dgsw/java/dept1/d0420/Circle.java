package kr.hs.dgsw.java.dept1.d0420;

public class Circle extends Polygon {
	
	protected final int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String getType() { 
		return "원";
	}
	
	@Override
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	public static void main(String[] args) {
		Polygon circle = new Circle(5);
		circle.print();
	}	
}
