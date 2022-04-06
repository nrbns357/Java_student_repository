package kr.hs.dgsw.java.dept1.d0406.sub;

import kr.hs.dgsw.java.dept1.d0406.AccessModifier;

public class Child extends AccessModifier{
	public static void main(String[] args) {
		Child child = new Child();
		child.publicValue = 8;
		child.privateValue = 5; // private는 다른 상속을 했을 때 자식 클래스에서 사용이 불가능하다.
		child.protectedValue = 7;
		child.defualtValue = 6; // 
	}
}
