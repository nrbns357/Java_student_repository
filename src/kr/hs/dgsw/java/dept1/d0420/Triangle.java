package kr.hs.dgsw.java.dept1.d0420;

public class Triangle extends Rectangle {
	
	protected final int width;
	
	protected final int height;
	
	public Triangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public String getType() { 
		return "삼각형";
	}
	
	@Override
	public double getArea() {
		return super.getArea()/2.0;
	}
	
	public static void main(String[] args) {
		Polygon triangle = new Triangle(5,3);
		triangle.print();
	}
}
