package kr.hs.dgsw.java.dept1.d0323;

public class DateTypeStudy {
	public void studyIntegerType(){ 	
		//정수형 타입들
		int intValue = 2000000000; // int는 20억까지 가능 (256bit)
		byte byteValue = -128; // -128 ~ 127 까지 
		short shortValue = -3000; //
		long longValue = 3000000000L; // 30억 까지 가능 | L을 붙인 이유는 long을 사용한다고 컴파일러에게 알려준다. 대소문자 상관없지만 대문자가 보기 쉬우므로 대부분 대문자를 쓴다.
	
		Integer ineger = 3;
	}
	
	public void studyRealNumberType() {
		float piFloat = 3.1415926F; // F를 붙인 이유는 float type이라는 것을 컴파일러에게 알려주는 것이다.
		double piDouble = 3.1415926;
		System.out.println(piFloat);
		System.out.println(piDouble);
	}
	
	public void studyBoolean() {
		System.out.println((4 > 2));
		
		boolean flag = true;
		boolean win = false;
		
		if (4 > 2) {
			// do something
		}
	}
	
	public void studyChar() {
		char ch1 = 'a';
		String str = "BC"; //빈 값이 들어가도 된다. ("");
		int ch2 = 65;
		
		System.out.println((int)ch1); //int형으로 변환
		System.out.println((char)ch2); // char형으로 변환
		
		char h1 = '가';
//		for (int i =1; i <= 10000; i++) {
//			
//		System.out.printf("%d - %c \n", (int)h1 + i, h1 + i);
//		}
		
		int countOfHangeul = '힣' - '가' +1;
		System.out.println("한글에 부여된 코드의 개수: " + countOfHangeul);
		
//		for (int i = 30000; i <= 40000; i++) {
//			char ch =(char)i;
//			
//			System.out.printf("%03d %02x - %c\n",i,i,ch);
//		}
	}
	
	public static void main(String[] args) {
		DateTypeStudy study = new DateTypeStudy();
		study.studyChar();
	}
	
	
}
