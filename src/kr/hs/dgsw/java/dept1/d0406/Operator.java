package kr.hs.dgsw.java.dept1.d0406;

public class Operator {
	public void wtudyArithmeticOperator() {
		int value;
		
		value = 3 + 5;
		value = 5 - 2;
		value = 4 * 4;
		value = 3 / 2;
		value = 8 % 3;
		
		value += 5; //value = value + 5;
		value -= 3;
		value *= 4;
		value /= 2;
		value %= 3;

		value++;
		value--;
		++value;
		--value;
		
		for(int i = 0; i < 10; i++ ) {
			System.out.println(i);
		}
	}
	
	public void studyCompareOperator() {
		boolean flag;
		
		flag = 3 < 2;
		flag = 6 == 6;
		flag = 3 != 4;
		flag = 5 >= 4;
	}

	public void studyBiwiseOperator() {
		int value1 = 0x01;
		int value2 = 0x02;
		int value3 = 0x03;
		
		int value;
		value = value1 & value2; // 비트연산
		System.out.printf("%d & %d = %d\n",value1, value2,value);

		value = value1 | value2;
		System.out.printf("%d | %d = %d\n",value1, value2,value);

		value = value1 ^ value3; // XOR연산 
		System.out.printf("%d ^ %d = %d\n",value1, value2,value);
		
		value = ~value1; 
		System.out.printf("~%d = %d\n",value1,value);
		
		value1 = 120; 
		value = value1 << 1; //left shift 연산자 왼쪽으로 이동한다 (X2 와 같다.)
		System.out.printf("%d << 1 = %d\n",value1,value);
		
		value1 = -1; 
		value = value1 >> 1; //right shift 연산자 오른쪽으로 이동한다 (/2 와 같다.)
		System.out.printf("%d >> 1 = %d\n",value1,value);
		
		value1 = -1; 
		value = value1 >>> 1; //right shift 연산자 오른쪽으로 이동한다 3개의 꺽새는 right shift연사자 밖에 없다. (/2 와 같다.)
		System.out.printf("%d >> 1 = %d\n",value1,value);
		
		
	}
	
	public static void main(String[] args) {
		Operator operator = new Operator();
		operator.studyBiwiseOperator();
	}

}


