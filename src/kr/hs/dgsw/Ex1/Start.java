package kr.hs.dgsw.Ex1;

public class Start {
	public static void main(String[] args) {
		People p1 = new People(); // 김영희
		p1.name = "김영희";
		p1.tall = 165;
		p1.weight = 55;
		
		People p2 = new People(); // 김철수
		p2.name = "김철수";
		p2.tall = 170;
		p2.weight = 90;
		
//		double P1Bmi = p1;
		p1.PrintBmi(); 
		p2.PrintBmi();
	}

}
