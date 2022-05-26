package kr.hs.dgsw.java.dept1.d0406;

public class AccessModifier {
	public int publicValue;
	
	public int privateValue;
	
	public int protectedValue;
	
	public int defualtValue;
	
	
	
	public static void main(String[] args) {
		AccessModifier accessModifier = new AccessModifier();
		accessModifier.publicValue = 5;
		accessModifier.privateValue = 7;
		accessModifier.protectedValue = 3;
		accessModifier.defualtValue = 1;
	}
}
