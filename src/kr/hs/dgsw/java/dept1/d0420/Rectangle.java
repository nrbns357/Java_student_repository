package kr.hs.dgsw.java.dept1.d0420;



public class Rectangle extends Polygon {

	protected final int width;
	
	protected final int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String getType() { 
		return "직각사각형";
	}
	
	@Override
	public double getArea() {
		return this.width * this.height;
	}
	
	public static void main(String[] args) {
		Polygon rectangle= new Rectangle(5,3);
		rectangle.print();
	}
}
